package com.crio.starter.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exceptions.MemeNotFoundException;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeRequestDto;
import com.crio.starter.exchange.MemeResponseDto;
import com.crio.starter.repository.IMemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemeService implements IMemeService{

    @Autowired
    private IMemeRepository memeRepository;

    @Override
    public List<MemeResponseDto> findLatestHunderedMemes() {
        // TODO Auto-generated method stub
        List<MemeResponseDto> ans = new ArrayList<>();
        List<MemeEntity> memeList = memeRepository.findAll();
        int size = memeList.size();
        if(size==0)return null;
        
        for(int i=size-1; i>=size-100; i--){
            if(i<0)continue;
            ans.add(new MemeResponseDto(memeList.get(i)));
        }
        System.out.println(ans.size());
        return ans;
    }

    @Override
    public MemeResponseDto findById(String id) throws MemeNotFoundException{
        // TODO Auto-generated method stub
        Optional<MemeEntity> optional = memeRepository.findById(id);
        if(!optional.isPresent())throw new MemeNotFoundException("Meme with "+id+ "doesn't exist");
        return new MemeResponseDto(optional.get());
    }

    @Override
    public MemeEntity create(MemeEntity memeEntity) {

        // TODO Auto-generated method stub
        return memeRepository.save(memeEntity);
    }

   

  
    
}
