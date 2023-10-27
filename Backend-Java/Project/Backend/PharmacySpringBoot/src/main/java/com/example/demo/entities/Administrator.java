package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicine_id")
    private Long medicineId;

    @Column(name = "medicine_name")
    private String medicineName;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    @Column(name = "expiry_date")
    private Date expiryDate;

    @Column(name = "supplier_name")
    private String supplierName;

    @Column(name = "last_updated")
    private Date lastUpdated;
    @Column(name = "Availibility")
    private boolean availibility;
	public Administrator(Long medicineId, String medicineName, int quantityInStock, Date expiryDate,
			String supplierName, Date lastUpdated, boolean availibility) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.quantityInStock = quantityInStock;
		this.expiryDate = expiryDate;
		this.supplierName = supplierName;
		this.lastUpdated = lastUpdated;
		this.availibility=availibility;
	}

	public boolean isAvailibility() {
		return availibility;
	}

	public void setAvailibility(boolean availibility) {
		this.availibility = availibility;
	}

	public Long getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(Long medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(int quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	@Override
	public String toString() {
		return "Administrator [medicineId=" + medicineId + ", medicineName=" + medicineName + ", quantityInStock="
				+ quantityInStock + ", expiryDate=" + expiryDate + ", supplierName=" + supplierName + ", lastUpdated="
				+ lastUpdated + ", availibility=" + availibility + "]";
	}

    
}
