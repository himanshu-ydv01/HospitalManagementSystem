package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Patient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);

    public List<Patient> getAllPatients() {
        try {
            System.out.println("into service layer");
            // interact with the repository layer
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While fetching all patients: {}", e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While fetching patient by id {}: {}",id, e.getMessage());
            return null;
        }
    }

    public Patient addPatient(Patient patient) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While adding patient: {}", e.getMessage());
            return null;
        }
    }

    public Patient updatePatientById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While updating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatientById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While deleting patient: {}", e.getMessage());
        }
    }
}
