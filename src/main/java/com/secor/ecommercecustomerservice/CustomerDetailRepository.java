package com.secor.ecommercecustomerservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerDetailRepository extends MongoRepository<CustomerDetail, String> {
}
