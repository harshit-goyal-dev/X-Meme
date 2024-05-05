package com.crio.starter.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import javax.annotation.Generated;
import javax.validation.constraints.NotEmpty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document
public class MemeEntity {
    
    @Id
    private String id;

    @NotEmpty
    private String name;

    @NotEmpty
    private String url;

    @NotEmpty
    private String caption;


   
}
