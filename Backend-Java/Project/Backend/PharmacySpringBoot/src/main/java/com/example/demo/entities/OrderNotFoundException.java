package com.example.demo.entities;

public class OrderNotFoundException extends Exception {
	public OrderNotFoundException(String message) {
        super(message);
    }
}
