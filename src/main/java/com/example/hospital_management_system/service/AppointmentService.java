package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Appointment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    public List<Appointment> GetAllAppointments() {
        try{
            System.out.println( "GetAllAppointments Service layer" );
            return null;
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Appointment addAppointment(Appointment appointment) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Appointment updateAppointmentById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public void deleteAppointmentById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
        }
    }
}
