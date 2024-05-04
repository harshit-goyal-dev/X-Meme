package com.crio.starter.repository;

import java.util.List;
import com.crio.starter.data.MemeEntity;
import com.crio.starter.exchange.MemeResponseDto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IMemeRepository extends MongoRepository<MemeEntity, String>{
}
