package com.crio.starter.repository;

import com.crio.starter.data.MemeEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMemeRepository extends MongoRepository<MemeEntity, String>{
    
}
