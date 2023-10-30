package com.example.demo.service;

import com.example.demo.entities.Medicine;
import com.example.demo.entities.Order;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.repository.MedicineRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class MedicineService {
	@Autowired
    private  MedicineRepository medicineRepository;

   
    
    public List<Medicine> getAllMedicines() {
        return medicineRepository.findAll();
    }

    public Medicine getMedicineById(Long id) throws MedicineNotFoundException {
        return medicineRepository.findById(id).orElseThrow(() -> new MedicineNotFoundException("Medicine with given id not found.")); 
    }

    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    public void updateMedicine(Long id, Medicine updatedMedicine) throws MedicineNotFoundException {
        if (medicineRepository.existsById(id)) {
        	updatedMedicine.setMedicineId(id);
             medicineRepository.save(updatedMedicine);
        }
        else{
        	throw new MedicineNotFoundException("Medicine with given id not found.");
        }
        
        }
        
        
        
    public void deleteMedicine(Long id) {
        Medicine medicine = medicineRepository.findById(id).get();
        System.out.println(medicine);
        medicineRepository.deleteById(id);    
    }
    
}
    
