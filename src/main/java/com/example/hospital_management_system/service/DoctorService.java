package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Doctor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println( "GetAllDoctors Service layer" );
            return null;
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Doctor addDoctor(Doctor doctor) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public Doctor updateDoctorById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            return null;
        }
    }

    public void deleteDoctorById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
        }
    }
}
