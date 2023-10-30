package com.example.demo.entities;

import java.sql.Date;

 
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
 
@Entity
public class Customer {
    @Id
    private int custId;
 
    private String custName;
    private Long phoneNumber;
    
    private Date date;
    private double calculatedPrice;
    @ManyToOne
    @JoinColumn(name = "medicine_id", referencedColumnName="medicineId")
    private Medicine medicine;
    @ManyToOne
    @JoinColumn(name = "stockId", referencedColumnName="stockId")
    private Stock stock;
    public Customer() {
    }
 
	public Customer(int custId, String custName, Long phoneNumber,   
			Date date,double calculatedPrice) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		
		
		
		this.date = date;
		this.calculatedPrice=calculatedPrice;
	}
 
	
 
	public double getCalculatedPrice() {
		return calculatedPrice;
	}
 
	public void setCalculatedPrice(double calculatedPrice) {
		this.calculatedPrice = calculatedPrice;
	}
 
	public int getCustId() {
		return custId;
	}
 
	public void setCustId(int custId) {
		this.custId = custId;
	}
 
	public String getCustName() {
		return custName;
	}
 
	public void setCustName(String custName) {
		this.custName = custName;
	}
 
	public Long getPhoneNumber() {
		return phoneNumber;
	}
 
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getDate() {
		return date;
	}
 
	public void setDate(Date date) {
		this.date = date;
	}
 
	public Medicine getMedicine() {
		return medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", phoneNumber=" + phoneNumber + ", date="
				+ date + ", calculatedPrice=" + calculatedPrice + ", medicine=" + medicine + ", stock=" + stock + "]";
	}

	



 
    

}
 