package com.tablebackend.tablebackend.mapper;

import java.util.List;
import com.tablebackend.tablebackend.dto.PersonDTO;
import com.tablebackend.tablebackend.entity.Person;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    Person map(PersonDTO personDTO);
    PersonDTO map(Person person);
    List<PersonDTO> map(List<Person> ListPerson);
}

