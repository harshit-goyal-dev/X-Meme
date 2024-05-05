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

    @Override
    public boolean equals(Object meme){

        MemeEntity memeEnt = (MemeEntity)meme;
        if(isEqual(this.id, memeEnt.getId()))return true;
        if(isEqual(this.name, memeEnt.getName()) && isEqual(this.caption, memeEnt.getCaption()) && isEqual(this.url, memeEnt.getUrl()))return true;

        return false;
    }

    private boolean isEqual(String s, String t){
        if(s==null || t==null)return false;
        return s.equals(t);
    }
}
