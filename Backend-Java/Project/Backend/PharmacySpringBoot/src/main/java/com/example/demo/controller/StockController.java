package com.example.demo.controller;
import com.example.demo.entities.Medicine;
import com.example.demo.entities.Stock;
import com.example.demo.service.StockService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;



    @DeleteMapping("/remove/expired")
    public void removeExpiredMedicine() {
        stockService.removeExpiredMedicine();
        
    }


    @PostMapping("/add")
    public String add(@RequestBody Stock stock){
    	 
    	 stockService.add(stock);
    	 return "added";
    }
    
    @GetMapping("/allmedicinefromstock")
    public List<Medicine> getAllMedicinesFromStock() {
        List<Stock> stocks = stockService.getAllStock();
        List<Medicine> medicinesInStock = new ArrayList<>();

        for (Stock stock : stocks) {
            medicinesInStock.add(stock.getMedicine());
        }

        return medicinesInStock;
    }
    
    
}

