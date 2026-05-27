package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Bill;
import com.example.hospital_management_system.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Getting all Bills");
        return billService.GetAllBills();
    }

    @PostMapping
    public Bill addBill(@RequestBody Bill bill) {
        System.out.println("Adding a bill");
        return billService.addBill(bill);
    }

    @GetMapping("/{id}")
    public Bill getBillById(@RequestParam Long id) {
        System.out.println("Getting bill by ID");
        return billService.getBillById(id);
    }

    @PutMapping("/{id}")
    public void updateBillById(@PathVariable Long id) {
        billService.updateBillById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable Long id) {
        billService.deleteBillById(id);
    }
}
