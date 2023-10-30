package com.example.demo.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import com.example.demo.entities.Order;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long medicineId;
    private String medicineName;
    private String medicineDescription;
    private double medicinePrice;
    private LocalDate manufacturerDate;

    @ManyToMany
    @JoinTable(
            name = "order_medicines",
            joinColumns =@JoinColumn(name = "medicine_id", referencedColumnName="medicineId"),
            inverseJoinColumns =  @JoinColumn(name = "order_id",referencedColumnName="orderId") 
            )
    private Set<Order> orderss = new HashSet<>();

    
    
    public Medicine() {
    }

    public Medicine(String medicineName, String medicineDescription, double medicinePrice, LocalDate manufacturerDate) {
        this.medicineName = medicineName;
        this.medicineDescription = medicineDescription;
        this.medicinePrice = medicinePrice;
        this.manufacturerDate = manufacturerDate;
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

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public double getMedicinePrice() {
		return medicinePrice;
	}

	public void setMedicinePrice(double medicinePrice) {
		this.medicinePrice = medicinePrice;
	}

	public LocalDate getManufacturerDate() {
		return manufacturerDate;
	}

	public void setManufacturerDate(LocalDate manufacturerDate) {
		this.manufacturerDate = manufacturerDate;
	}

	public Set<Order> getOrders() {
		return orderss;
	}

	public void setOrders(Set<Order> orders) {
		this.orderss = orders;
	}

	@Override
    public String toString() {
        return "Medicine{" +
                "id=" + medicineId +
                ", name='" + medicineName + '\'' +
                ", description='" + medicineDescription + '\'' +
                ", price=" + medicinePrice +
                ", manufacturer='" + manufacturerDate + '\'' +
                '}';
    }
}

