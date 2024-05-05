package com.crio.starter.controller;

import lombok.RequiredArgsConstructor;
import java.util.List;
import javax.validation.Valid;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exceptions.MemeNotFoundException;
import com.crio.starter.exchange.MemeCreatedResponseDto;
import com.crio.starter.exchange.MemeListResponseDto;
import com.crio.starter.exchange.MemeResponseDto;
import com.crio.starter.service.IMemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemeController {

    protected static final String APPLICATION_ENDPOINT = "/xmeme/api/v1";
    private static final String MEME_ENDPOINT = "/memes";

    @Autowired
    private IMemeService memeService;
    
    @PostMapping(MEME_ENDPOINT)
    public ResponseEntity<MemeCreatedResponseDto> addMeme(@RequestBody @Valid MemeEntity meme){
        
            MemeEntity memeEntity = memeService.create(meme);
            return ResponseEntity.ok().body(new MemeCreatedResponseDto(memeEntity.getId()));
        
    }

    @GetMapping(MEME_ENDPOINT)
    public ResponseEntity<List<MemeResponseDto>> getMemes(){
        List<MemeResponseDto> responseDto = memeService.findLatestHunderedMemes();
        return ResponseEntity.ok().body(responseDto);
    }

    @GetMapping(MEME_ENDPOINT+"/{id}")
    public ResponseEntity<MemeResponseDto> getMemeById(@PathVariable String id){
        MemeResponseDto responseDto = null;
        try{
            responseDto = memeService.findById(id);

        }catch(MemeNotFoundException exception){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(responseDto);
    }
}
