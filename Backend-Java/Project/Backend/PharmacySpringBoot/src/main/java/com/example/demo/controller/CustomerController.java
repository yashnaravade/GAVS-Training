package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Medicine;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.service.CustomerService;
import com.example.demo.service.MedicineService;
@RestController
@RequestMapping("/customer") 
public class CustomerController {
 
    @Autowired
    CustomerService service;
    @Autowired
    MedicineService service2;
    
    @PostMapping("/addCustomer")
    public String addNewcustomer(@RequestBody Customer customer) throws MedicineNotFoundException {
        Long medicineid = customer.getMedicine().getMedicineId();
        Medicine obj= service2.getMedicineById(medicineid);
        double pricePerUnit=obj.getMedicinePrice();        
        int quantity = customer.getStock().getQuantity();
        double calculatedPrice = pricePerUnit * quantity;
        customer.setCalculatedPrice(calculatedPrice);
        service.saveCustomer(customer);
        return "customerBillingDone"; 
    }
}
 