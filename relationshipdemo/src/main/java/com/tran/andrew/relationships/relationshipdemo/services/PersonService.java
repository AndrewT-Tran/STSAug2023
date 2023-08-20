package com.tran.andrew.relationships.relationshipdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tran.andrew.relationships.relationshipdemo.models.Person;
import com.tran.andrew.relationships.relationshipdemo.repositories.PersonRepo;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

    public List<Person> getAllPersons() {
        return (List<Person>) personRepo.findAll();
    }

    public Person createPerson(Person personForm) {
        Person person = new Person();
        return personRepo.save(person);
    }

    public static Person findById(Long person_id) {
        return null;
    }
}
