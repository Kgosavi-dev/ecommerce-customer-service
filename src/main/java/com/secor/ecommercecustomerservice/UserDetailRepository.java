package com.secor.ecommercecustomerservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDetailRepository extends MongoRepository<UserDetail, String> {
}
