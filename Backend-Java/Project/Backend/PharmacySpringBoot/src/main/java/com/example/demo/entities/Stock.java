package com.example.demo.entities;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stockId;

    @ManyToOne
    @JoinColumn(name = "medicine_id", referencedColumnName="medicineId", nullable = false)
    private Medicine medicine;

    private int quantity;
    private Date expirationDate;

   
    public Stock() {
    }

    public Stock(Medicine medicine, int quantity, Date expirationDate) {
        this.medicine = medicine;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    
    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long id) {
        this.stockId = id;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
