package com.crio.starter.service;

import java.util.List;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exchange.*;
import org.springframework.stereotype.Service;;

@Service
public interface IMemeService {
    public List<MemeResponseDto> findLatestHunderedMemes(); 

    public MemeResponseDto findById(String id);

    public MemeEntity create(MemeEntity memeEntity);
}
