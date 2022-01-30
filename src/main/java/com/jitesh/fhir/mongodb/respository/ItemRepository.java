package com.jitesh.fhir.mongodb.respository;

import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.jitesh.fhir.practitioner.model.Practitioner;

import org.springframework.data.mongodb.repository.MongoRepository;

@EnableReactiveMongoRepositories
public interface ItemRepository extends MongoRepository<Practitioner, String>  {

}
