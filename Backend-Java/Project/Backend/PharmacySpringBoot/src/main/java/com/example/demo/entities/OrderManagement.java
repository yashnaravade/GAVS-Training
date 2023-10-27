package com.example.demo.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class OrderManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "medicine_id")
    private Administrator medicine;

    @Column(name = "order_quantity")
    private int orderQuantity;

    @Column(name = "order_date")
    private Date orderDate;
    public OrderManagement() {}

	public OrderManagement(Long orderId, Administrator medicine, int orderQuantity, Date orderDate) {
		super();
		this.orderId = orderId;
		this.medicine = medicine;
		this.orderQuantity = orderQuantity;
		this.orderDate = orderDate;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Administrator getMedicine() {
		return medicine;
	}

	public void setMedicine(Administrator medicine) {
		this.medicine = medicine;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "OrderManagement [orderId=" + orderId + ", medicine=" + medicine + ", orderQuantity=" + orderQuantity
				+ ", orderDate=" + orderDate + "]";
	}

    
}

