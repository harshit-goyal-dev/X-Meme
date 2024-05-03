package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MemeResponseDto {

    private int id;
    private String userName;
    private String caption;
    private String imageUrl;
}
