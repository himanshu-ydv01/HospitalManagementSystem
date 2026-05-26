package com.example.hospital_management_system.controllers;


import com.example.hospital_management_system.models.Appointment;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return null;
    }

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        System.out.println("Adding a appointment");
        return appointment;
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentId(@RequestParam Long id) {
        System.out.println("Getting appointment by ID");
        return null;
    }

    @PutMapping("/{id}")
    public void updateAppointmentById(@PathVariable Long id) {
    }

    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@PathVariable Long id) {
    }
}
