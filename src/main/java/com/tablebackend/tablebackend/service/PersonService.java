package com.tablebackend.tablebackend.service;

import com.tablebackend.tablebackend.dto.PersonDTO;
import com.tablebackend.tablebackend.entity.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PersonService {
    List<Person> findAll();
}
