package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRespository;

 

 
@Service
public class CustomerService {
 
	@Autowired
    private CustomerRespository repository;
	 public String saveCustomer(Customer customer){
		  repository.save(customer);
	      return "Customer Billing Done";
	 }
}
