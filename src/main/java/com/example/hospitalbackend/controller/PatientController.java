package com.example.hospitalbackend.controller;

import com.example.hospitalbackend.model.Patient;
import com.example.hospitalbackend.repository.PatientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
@CrossOrigin(origins = "*")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @GetMapping
    public List<Patient> getPatients() {

        return repository.findAll();
    }

    @PostMapping
    public Patient addPatient(
            @RequestBody Patient patient
    ) {

        return repository.save(patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(
            @PathVariable String id
    ) {

        repository.deleteById(id);
    }
}