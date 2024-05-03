package com.crio.starter.service;

import java.util.List;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exchange.*;;

public interface IMemeService {
    public List<MemeResponseDto> findAll(); 

    public MemeResponseDto findById();

    public MemeEntity create();
}
