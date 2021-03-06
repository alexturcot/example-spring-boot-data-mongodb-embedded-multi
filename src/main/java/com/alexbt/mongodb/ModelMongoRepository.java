package com.alexbt.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ModelMongoRepository extends MongoRepository<Model, String> {
}     