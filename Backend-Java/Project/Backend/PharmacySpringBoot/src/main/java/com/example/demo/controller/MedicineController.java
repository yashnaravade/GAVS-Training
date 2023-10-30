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
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/allmedicine")
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
        return "Medicine Added Successfully";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/updatemedicine/{id}")
    public String updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) throws MedicineNotFoundException {
    	medicineService.updateMedicine(id, medicine);
    	return "Medicine Updated Successfully!";
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/delete/{id}")
    public String deleteMedicineById(@PathVariable("id") Long id) throws MedicineNotFoundException {
        medicineService.deleteMedicine(id);
        return "Medicine Deleted Successfully";
    }
    
}
