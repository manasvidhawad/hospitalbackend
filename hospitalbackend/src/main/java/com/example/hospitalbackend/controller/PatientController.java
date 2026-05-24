package com.example.hospitalbackend.controller;

import com.example.hospitalbackend.model.Patient;

import com.example.hospitalbackend.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@CrossOrigin(origins = "http://localhost:5173")

public class PatientController {

    @Autowired

    PatientRepository repository;

    @GetMapping("/patients")

    public List<Patient> getPatients() {

        return repository.findAll();
    }

    @PostMapping("/patients")

    public Patient addPatient(
            @RequestBody Patient patient
    ) {

        return repository.save(patient);
    }

    @DeleteMapping("/patients/{id}")

    public void deletePatient(
            @PathVariable String id
    ) {

        repository.deleteById(id);
    }
}