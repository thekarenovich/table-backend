package com.tablebackend.tablebackend.repository;

import com.tablebackend.tablebackend.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PersonRepo extends JpaRepository<Person, UUID> {
}
