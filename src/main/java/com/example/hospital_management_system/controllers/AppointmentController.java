package com.example.hospital_management_system.controllers;


import com.example.hospital_management_system.models.Appointment;
import com.example.hospital_management_system.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @GetMapping
    public List<Appointment> getAllAppointments() {
        System.out.println("Getting all appointments");
        return appointmentService.GetAllAppointments();
    }

    @PostMapping
    public Appointment addAppointment(@RequestBody Appointment appointment) {
        System.out.println("Adding a appointment");
        return appointmentService.addAppointment(appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointmentById(@RequestParam Long id) {
        System.out.println("Getting appointment by ID");
        return appointmentService.getAppointmentById(id);
    }

    @PutMapping("/{id}")
    public void updateAppointmentById(@PathVariable Long id, @RequestBody Appointment appointment) {
        appointmentService.updateAppointmentById(id,appointment);
    }

    @DeleteMapping("/{id}")
    public void deleteAppointmentById(@PathVariable Long id) {
        appointmentService.deleteAppointmentById(id);
    }
}
