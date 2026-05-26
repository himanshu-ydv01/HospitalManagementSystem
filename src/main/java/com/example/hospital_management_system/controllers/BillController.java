package com.example.hospital_management_system.controllers;

import com.example.hospital_management_system.models.Bill;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/bills")
public class BillController {

    @GetMapping
    public List<Bill> getAllBills() {
        System.out.println("Getting all Bills");
        return null;
    }

    @PostMapping
    public Bill addBill(@RequestBody Bill bill) {
        System.out.println("Adding a bill");
        return bill;
    }

    @GetMapping("/{id}")
    public Bill getBillId(@RequestParam Long id) {
        System.out.println("Getting bill by ID");
        return null;
    }

    @PutMapping("/{id}")
    public void updateBillById(@PathVariable Long id) {
    }

    @DeleteMapping("/{id}")
    public void deleteBillById(@PathVariable Long id) {
    }
}
