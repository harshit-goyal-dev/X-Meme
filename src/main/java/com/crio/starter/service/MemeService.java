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
    public MemeListResponseDto findLatestHunderedMemes() {
        // TODO Auto-generated method stub
        List<MemeEntity> memeList = memeRepository.findAll();
        int size = memeList.size();
        if(size<=100)return new MemeListResponseDto(memeList);

        List<MemeEntity> memes = new ArrayList<>();
        for(int i=size-1; i>=size-101; i--){
            memes.add(memeList.get(i));
        }
        return new MemeListResponseDto(memes);
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
        // MemeEntity meme = new 
        // System.out.println(memeRequestDto.toString());
        // System.out.println(meme.toString());
        return memeRepository.save(memeEntity);
    }

   

  
    
}
