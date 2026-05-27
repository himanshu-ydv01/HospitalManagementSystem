package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Doctor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println( "GetAllDoctors Service layer" );
            return null;
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error( "Error while getting all doctors: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while getting doctor by id: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor addDoctor(Doctor doctor) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while adding doctor: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor updateDoctorById(Long id, Doctor doctor) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while updating doctor by id: {}", e.getMessage() );
            return null;
        }
    }

    public void deleteDoctorById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while deleting doctor by id: {}", e.getMessage() );
        }
    }
}
