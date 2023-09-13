package com.example.onetooneuni.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.onetooneuni.entity.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {

}
