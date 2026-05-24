package com.example.hospitalbackend.repository;

import com.example.hospitalbackend.model.Patient;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository
        extends JpaRepository<Patient, String> {

}