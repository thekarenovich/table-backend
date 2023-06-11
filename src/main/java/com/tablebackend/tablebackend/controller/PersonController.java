package com.tablebackend.tablebackend.controller;

import com.tablebackend.tablebackend.entity.Contacts;
import com.tablebackend.tablebackend.entity.Person;
import com.tablebackend.tablebackend.repository.PersonRepo;
import com.tablebackend.tablebackend.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = {"http://localhost:8080", "http://192.168.0.11:8080"})
public class PersonController {

    @Autowired
    private final PersonService personService;
    @Autowired
    private final PersonRepo personRepo;

    public PersonController(PersonService personService, PersonRepo personRepo) {
        this.personService = personService;
        this.personRepo = personRepo;
    }

    @GetMapping("/persons")
    public List<Person> fetchPersons(){
        // personRepo.save(new Person(UUID.randomUUID(), "1", "11", new Contacts("111", "1111")));
        return personService.findAll();
    }
}

