package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Land;


@Repository
public interface LandRepo extends MongoRepository<Land, Long> {

}
