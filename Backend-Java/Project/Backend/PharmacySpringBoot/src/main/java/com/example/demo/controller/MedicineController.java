package com.example.demo.controller;

import com.example.demo.entities.Medicine;

import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.service.MedicineService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getmedicine")
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/medicineid/{id}")
    public Medicine getMedicineById(@PathVariable Long id) throws MedicineNotFoundException {
        return medicineService.getMedicineById(id);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addmedicine")
    public String addMedicine(@RequestBody Medicine medicine) {
        medicineService.addMedicine(medicine);
        return "Medicine added successfully";
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updatemedicine/{id}")
    public String updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) throws MedicineNotFoundException {
    	medicineService.updateMedicine(id, medicine);
    	return "Medicine updated successfully";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/deletemedicine/{id}")
    public String deleteMedicineById(@PathVariable("id") Long id) throws MedicineNotFoundException {
        medicineService.deleteMedicine(id);
        return "Medicine deleted successfully";
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/checkExpiryDates")
    public List<Medicine> checkExpiryDates() {
    	return medicineService.checkExpiryDates();
    }
    
}
