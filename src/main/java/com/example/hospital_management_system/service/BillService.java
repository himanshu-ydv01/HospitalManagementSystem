package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Bill;
import com.example.hospital_management_system.models.Doctor;
import com.example.hospital_management_system.repository.BillRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    @Autowired
    private BillRepository billRepository;

    public List<Bill> GetAllBills() {
        try{
            System.out.println( "GetAllBills Service layer" );
            return billRepository.findAll();
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error("Error while getting all bills: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            Optional<Bill> bill = billRepository.findById(id);
            return bill.orElse(null);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while getting bill by id: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill addBill(Bill bill) {
        try {
            billRepository.save(bill);
            return bill;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while adding bill: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill updateBillById(Long id, Bill updatedBill) {
        try {
            Optional<Bill> existingBill = billRepository.findById(id);

            if(existingBill.isPresent()) {
                Bill b = existingBill.get();
                b.setPatientId(updatedBill.getPatientId());
                b.setAmount(updatedBill.getAmount());
                b.setStatus(updatedBill.getStatus());
                billRepository.save(b);

                return updatedBill;
            }else{
                logger.error("Bill not  found with id {}",id);
                return null;
            }

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while updating bill by id: {} ", e.getMessage() );
            return null;
        }
    }

    public void deleteBillById(Long id) {
        try {
            logger.info("Deleting bill with id {}",id);
            billRepository.deleteById(id);
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while deleting bill by id: {} ", e.getMessage() );
        }
    }
}
