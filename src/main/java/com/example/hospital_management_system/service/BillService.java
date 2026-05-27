package com.example.hospital_management_system.service;

import com.example.hospital_management_system.models.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    private static final Logger logger = LoggerFactory.getLogger(BillService.class);

    public List<Bill> GetAllBills() {
        try{
            System.out.println( "GetAllBills Service layer" );
            return null;
        } catch (Exception e) {
            System.out.println( "Error message: " + e.getMessage() );
            logger.error("Error while getting all bills: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill getBillById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while getting bill by id: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill addBill(Bill bill) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while adding bill: {} ", e.getMessage() );
            return null;
        }
    }

    public Bill updateBillById(Long id) {
        try {
            return null;
        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while updating bill by id: {} ", e.getMessage() );
            return null;
        }
    }

    public void deleteBillById(Long id) {
        try {

        }catch (Exception e){
            System.out.println("Error message" + e.getMessage());
            logger.error("Error while deleting bill by id: {} ", e.getMessage() );
        }
    }
}
