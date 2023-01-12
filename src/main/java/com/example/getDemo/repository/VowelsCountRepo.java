package com.example.getDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VowelsCountRepo extends MongoRepository<VowelsCountRepo, Integer> {
}
