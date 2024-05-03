package com.crio.starter.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document
public class MemeEntity {
    
    @Id
    private int id;
    private String userName;
    private String caption;
    private String imageUrl;
}
