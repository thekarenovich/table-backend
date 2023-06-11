package com.tablebackend.tablebackend.service.impl;

import com.tablebackend.tablebackend.dto.PersonDTO;
import com.tablebackend.tablebackend.entity.Person;
import com.tablebackend.tablebackend.mapper.PersonMapper;
import com.tablebackend.tablebackend.repository.PersonRepo;
import com.tablebackend.tablebackend.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepo personRepo;

    public PersonServiceImpl(PersonRepo personRepo) {
        this.personRepo = personRepo;

    }

    @Override
    public List<Person> findAll() {
        return personRepo.findAll();
    }
}
