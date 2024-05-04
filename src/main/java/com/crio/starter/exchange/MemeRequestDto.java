package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import com.crio.starter.data.MemeEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemeRequestDto {

    private String name;
    private String url;
    private String caption;
}
