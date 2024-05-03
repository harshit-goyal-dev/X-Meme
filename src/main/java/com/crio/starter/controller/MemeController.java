package com.crio.starter.controller;

import com.crio.starter.exchange.MemeCreatedResponseDto;
import com.crio.starter.exchange.MemeRequestDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemeController {
    private static final String APPLICATION_ENDPOINT = "/xmeme/api/v1";
    private static final String MEME_ENDPOINT = "/memes";

    @Autowired
    private IMemeService memeService;
    
    @GetMapping(MEME_ENDPOINT)
    public ResponseEntity<MemeCreatedResponseDto> addMeme(MemeRequestDto memeRequestDto){

        return ResponseEntity.ok().body();
    }
}
