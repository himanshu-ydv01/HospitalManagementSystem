package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Doctor;
import com.example.hospital_management_system.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public Page<Doctor> getAllDoctors(@RequestParam(defaultValue = "0") int page,
                                      @RequestParam(defaultValue = "2") int size) {
        System.out.println("Getting all doctors");
        return doctorService.getAllDoctors(page,size);
    }

    @PostMapping
    public Doctor addDoctor(@RequestBody Doctor doctor) {
        System.out.println("Adding a doctor");
        return doctorService.addDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor getDoctorById(@PathVariable Long id) {
        System.out.println("Getting doctor by ID");
        return doctorService.getDoctorById(id);
    }

    @PutMapping("/{id}")
    public void updateDoctorById(@PathVariable Long id, @RequestBody Doctor doctor) {
        doctorService.updateDoctorById(id,doctor);
    }

    @DeleteMapping("/{id}")
    public void deleteDoctorById(@PathVariable Long id) {
        doctorService.deleteDoctorById(id);
    }
}
