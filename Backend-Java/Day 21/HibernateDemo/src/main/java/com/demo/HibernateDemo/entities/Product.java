package com.demo.HibernateDemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
	private int prdId;
	private String prdName;
	private String prdCategory;
	private double prdPrice;
	public Product() {
		super();
	}
 
	public Product(int prdId, String prdName, String prdCategory, double prdPrice) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCategory = prdCategory;
		this.prdPrice = prdPrice;
	}
 
	public int getPrdId() {
		return prdId;
	}
 
	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}
 
	public String getPrdName() {
		return prdName;
	}
 
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
 
	public String getPrdCategory() {
		return prdCategory;
	}
 
	public void setPrdCategory(String prdCategory) {
		this.prdCategory = prdCategory;
	}
 
	public double getPrdPrice() {
		return prdPrice;
	}
 
	public void setPrdPrice(double prdPrice) {
		this.prdPrice = prdPrice;
	}
	
}
