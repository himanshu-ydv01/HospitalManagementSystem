package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Patient;
import com.example.hospital_management_system.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        System.out.println("Getting all patients");
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        System.out.println("Adding a patient to the patients list");
        return patientService.addPatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@RequestParam Long id) {
        System.out.println("Getting a patient by ID");
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public void updatePatientById(@PathVariable Long id, @RequestBody Patient patient) {
        patientService.updatePatientById(id, patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id) {
        patientService.deletePatientById(id);
    }
}
