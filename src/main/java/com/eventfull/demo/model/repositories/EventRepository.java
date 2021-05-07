package com.eventfull.demo.model.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eventfull.demo.model.entities.EventEntity;

@Repository
public interface EventRepository extends MongoRepository<EventEntity, String> {

}
