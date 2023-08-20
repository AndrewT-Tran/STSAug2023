package com.tran.andrew.relationships.relationshipdemo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tran.andrew.relationships.relationshipdemo.models.Person;


public interface PersonRepo extends CrudRepository<Person, Long> {
}
