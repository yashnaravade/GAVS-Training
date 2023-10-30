package com.example.demo.controller;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.entities.Stock;
import com.example.demo.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;

//    @PostMapping("/addMedicineToStock/{medicineId}")
//    public void addMedicineToStock(@PathVariable Long medicineId, @RequestParam int quantity,@RequestParam String expirationDate) throws MedicineNotFoundException, ParseException {
//    	 Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(expirationDate);  
//            stockService.addMedicineToStock(medicineId, quantity, date1);
//            
//    }

    @DeleteMapping("/remove/expired")
    public void removeExpiredMedicine() {
        stockService.removeExpiredMedicine();
        
    }


    @PostMapping("/add")
    public String add(@RequestBody Stock stock){
    	 
    	 stockService.add(stock);
    	 return "added";
    }
    
    
    
}

