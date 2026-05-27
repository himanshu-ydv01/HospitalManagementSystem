package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Patient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    public List<Patient> getAllPatients() {
        try {
            System.out.println("into service layer");
            // interact with the repository layer
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Patient addPatient(Patient patient) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Patient updatePatientById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public void deletePatientById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
        }
    }
}
