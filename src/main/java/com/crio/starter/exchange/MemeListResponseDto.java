package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import com.crio.starter.data.MemeEntity;

@Getter
@Setter
@AllArgsConstructor
public class MemeListResponseDto {

   private List<MemeEntity> memes;


}
