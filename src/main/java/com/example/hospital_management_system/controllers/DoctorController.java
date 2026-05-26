package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Doctor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @GetMapping
    public List<Doctor> getAllDoctors() {
        System.out.println("Getting all doctors");
        return null;
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        System.out.println("Adding a doctor");
        return doctor;
    }

    @GetMapping("/{id}")
    public Doctor getDoctorId(@RequestParam Long id) {
        System.out.println("Getting doctor by ID");
        return null;
    }

    @PutMapping("/{id}")
    public void updateDoctorById(@PathVariable Long id) {
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id) {
    }
}
