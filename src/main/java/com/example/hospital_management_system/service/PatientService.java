package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Patient;
import com.example.hospital_management_system.repository.PatientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    private static final Logger logger = LoggerFactory.getLogger(PatientService.class);
    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatients() {
        try {
            System.out.println("into service layer");
            // interact with the repository layer
            return patientRepository.findAll();
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While fetching all patients: {}", e.getMessage());
            return null;
        }
    }

    public Patient getPatientById(Long id) {
        try {
            Optional<Patient> patient = patientRepository.findById(id);
            return patient.orElse(null);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While fetching patient by id {}: {}",id, e.getMessage());
            return null;
        }
    }

    public Patient addPatient(Patient patient) {
        try {
            patientRepository.save(patient);
            return patient;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While adding patient: {}", e.getMessage());
            return null;
        }
    }

    public Patient updatePatientById(Long id, Patient updatedPatient) {
        try {
            Optional<Patient> existingPatient = patientRepository.findById(id);
            if(existingPatient.isPresent()) {
                Patient p = existingPatient.get();
                p.setName(updatedPatient.getName());
                p.setAge(updatedPatient.getAge());
                p.setGender(updatedPatient.getGender());
                patientRepository.save(p);

                return updatedPatient;
            }else{
                logger.error("Patient not found with id {}", id);
                return null;
            }
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While updating patient: {}", e.getMessage());
            return null;
        }
    }

    public void deletePatientById(Long id) {
        try {
            logger.info("Deleting patient by id {}", id);
            patientRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error While deleting patient: {}", e.getMessage());
        }
    }
}
