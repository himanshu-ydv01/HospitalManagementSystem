package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Doctor;
import com.example.hospital_management_system.models.Patient;
import com.example.hospital_management_system.repository.DoctorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    private static final Logger logger = LoggerFactory.getLogger(DoctorService.class);
    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        try{
            System.out.println( "GetAllDoctors Service layer" );
            return doctorRepository.findAll();
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error( "Error while getting all doctors: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor getDoctorById(Long id) {
        try {
            Optional<Doctor> doctor = doctorRepository.findById(id);
            return doctor.orElse(null);

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while getting doctor by id: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor addDoctor(Doctor doctor) {
        try {
            doctorRepository.save(doctor);
            return doctor;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while adding doctor: {}", e.getMessage() );
            return null;
        }
    }

    public Doctor updateDoctorById(Long id, Doctor updatedDoctor) {
        try {
            Optional<Doctor> existingDoctor = doctorRepository.findById(id);
            if(existingDoctor.isPresent()) {
                Doctor d = existingDoctor.get();
                d.setName(updatedDoctor.getName());
                d.setAge(updatedDoctor.getAge());
                d.setSpeciality(updatedDoctor.getSpeciality());
                doctorRepository.save(d);

                return updatedDoctor;
            }else{
                logger.error("Doctor not  found with id {}",id);
                return null;
            }
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while updating doctor by id: {}", e.getMessage() );
            return null;
        }
    }

    public void deleteDoctorById(Long id) {
        try {
            logger.info("Deleting doctor with id {}",id);
            doctorRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error( "Error while deleting doctor by id: {}", e.getMessage() );
        }
    }
}
