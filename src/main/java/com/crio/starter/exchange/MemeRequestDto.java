package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemeRequestDto {

    private String userName;
    private String caption;
    private String imageUrl;

}
