package com.example.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetooneuni.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
