package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.crio.starter.data.MemeEntity;

@AllArgsConstructor
@Getter
@Setter
public class MemeResponseDto {

    private String id;
    private String name;
    private String url;
    private String caption;

    public MemeResponseDto(MemeEntity meme){
        id = meme.getId();
        name = meme.getName();
        url = meme.getUrl();
        caption = meme.getCaption();
    }
}
