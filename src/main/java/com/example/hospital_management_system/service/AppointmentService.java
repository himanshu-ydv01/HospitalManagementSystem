package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Appointment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    public List<Appointment> GetAllAppointments() {
        try{
            System.out.println( "GetAllAppointments Service layer" );
            return null;
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error("Error while getting all appointments: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while getting appointment by id: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment addAppointment(Appointment appointment) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while adding appointment: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment updateAppointmentById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while updating appointment by id: {} ", e.getMessage() );
            return null;
        }
    }

    public void deleteAppointmentById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while deleting appointment by id: {} ", e.getMessage() );
        }
    }
}
