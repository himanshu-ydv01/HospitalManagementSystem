package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Getting all patients");
        return null;
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        System.out.println("Adding a patient to the patients list");
        return patient;
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@RequestParam Long id) {
        System.out.println("Getting a patient by ID");
        return null;
    }

    @PutMapping("/{id}")
    public void updatePatientById(@PathVariable Long id) {
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id) {
    }
}
