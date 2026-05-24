package com.example.hospitalbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PATIENTS")
public class Patient {

    @Id
    private String patientId;

    private String wardType;

    private int days;

    public Patient() {
    }

    public Patient(
            String patientId,
            String wardType,
            int days) {

        this.patientId = patientId;
        this.wardType = wardType;
        this.days = days;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}