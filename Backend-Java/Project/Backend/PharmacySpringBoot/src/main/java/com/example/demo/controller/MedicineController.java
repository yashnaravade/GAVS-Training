package com.example.demo.controller;

import com.example.demo.entities.Medicine;
import com.example.demo.entities.Order;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.service.MedicineService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @GetMapping("/allmedicine")
    public List<Medicine> getAllMedicines() {
        return medicineService.getAllMedicines();
    }

    @GetMapping("/medicineid/{id}")
    public Medicine getMedicineById(@PathVariable Long id) throws MedicineNotFoundException {
        return medicineService.getMedicineById(id);
    }

    @PostMapping("/addmedicine")
    public void addMedicine(@RequestBody Medicine medicine) {
        medicineService.addMedicine(medicine);
    }

    @PutMapping("/updatemedicine/{id}")
    public void updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) throws MedicineNotFoundException {
    	medicineService.updateMedicine(id, medicine);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMedicineById(@PathVariable("id") Long id) throws MedicineNotFoundException {
        medicineService.deleteMedicine(id);
        return "deleted";
    }
    
}
