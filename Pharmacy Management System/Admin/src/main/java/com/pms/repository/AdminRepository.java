package com.pms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pms.models.Admin;

public interface AdminRepository extends MongoRepository <Admin, Integer> {
			
}