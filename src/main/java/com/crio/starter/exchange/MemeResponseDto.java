package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import com.crio.starter.data.MemeEntity;

@AllArgsConstructor
@Getter
@Setter
public class MemeResponseDto {
    private MemeEntity meme;

}
