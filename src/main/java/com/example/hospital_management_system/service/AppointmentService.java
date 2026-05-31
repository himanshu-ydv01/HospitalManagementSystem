package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Appointment;
import com.example.hospital_management_system.models.Doctor;
import com.example.hospital_management_system.repository.AppointmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Page<Appointment> getAllAppointments(int page,int size) {
        try{
            System.out.println( "GetAllAppointments Service layer" );
            Pageable pageable = PageRequest.of(page,size);
            return appointmentRepository.findAll(pageable);
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error("Error while getting all appointments: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment getAppointmentById(Long id) {
        try {
            Optional<Appointment> appointment = appointmentRepository.findById(id);
            return appointment.orElse(null);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while getting appointment by id: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment addAppointment(Appointment appointment) {
        try {
            appointmentRepository.save(appointment);
            return appointment;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while adding appointment: {} ", e.getMessage() );
            return null;
        }
    }

    public Appointment updateAppointmentById(Long id, Appointment updatedAppointment) {
        try {
            Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
            if(existingAppointment.isPresent()) {
                Appointment a = existingAppointment.get();
                a.setPatientId(updatedAppointment.getPatientId());
                a.setDoctorId(updatedAppointment.getDoctorId());
                a.setDate(updatedAppointment.getDate());
                appointmentRepository.save(a);

                return updatedAppointment;
            }else{
                logger.error("Appointment not  found with id {}",id);
                return null;
            }
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while updating appointment by id: {} ", e.getMessage() );
            return null;
        }
    }

    public void deleteAppointmentById(Long id) {
        try {
            logger.info("Bill deleted with id {}",id);
            appointmentRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while deleting appointment by id: {} ", e.getMessage() );
        }
    }
}
