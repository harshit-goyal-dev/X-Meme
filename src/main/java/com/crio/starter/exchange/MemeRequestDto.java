package com.crio.starter.exchange;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import com.crio.starter.data.MemeEntity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemeRequestDto {

    @NotEmpty
    @Size(min=1)
    private String name;

    @NotEmpty
    @Size(min=1)
    private String url;

    @NotEmpty
    @Size(min=1)
    private String caption;
}
