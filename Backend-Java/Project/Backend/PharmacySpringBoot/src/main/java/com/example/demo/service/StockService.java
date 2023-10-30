package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Medicine;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.entities.Stock;
import com.example.demo.repository.MedicineRepository;
import com.example.demo.repository.StockRepository;
import java.util.Date;
import java.util.List;

@Service
public class StockService {
	
	 @Autowired
    private  StockRepository stockRepository;
	 @Autowired
    private  MedicineRepository medicineRepository;
	 
    public void addMedicineToStock(Long medicineId, int quantity, Date expirationDate) throws MedicineNotFoundException {
    	if(medicineRepository.existsById(medicineId)) {
        Medicine medicine = medicineRepository.findById(medicineId).get();
            Stock stock = new Stock();
            stock.setMedicine(medicine);
            stock.setQuantity(quantity);
            stock.setExpirationDate(expirationDate);
            stockRepository.save(stock);
        }
    	else {
    		throw new MedicineNotFoundException("Medicine with given id not found.");
    	}
    }

    public void removeExpiredMedicine() {
        Date currentDate = new Date();
        List<Stock> expiredStock = stockRepository.findByExpirationDateBefore(currentDate);
        stockRepository.deleteAll(expiredStock);
    }
    
    
    public void add(Stock stock) {
    	stockRepository.save(stock);
    	
    }
    
}
