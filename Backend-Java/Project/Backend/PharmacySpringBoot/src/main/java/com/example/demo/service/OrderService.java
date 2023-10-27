package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Administrator;
import com.example.demo.entities.OrderDTO;
import com.example.demo.entities.OrderManagement;
import com.example.demo.repository.AdministratorRepository;
import com.example.demo.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final AdministratorRepository inventoryRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository, AdministratorRepository inventoryRepository) {
        this.orderRepository = orderRepository;
        this.inventoryRepository = inventoryRepository;
    }

    public void createOrder(OrderDTO orderDTO) {
        Optional<Administrator> optionalMedicine = inventoryRepository.findById(orderDTO.getMedicineId());
        if (optionalMedicine.isPresent()) {
        	Administrator medicine = optionalMedicine.get();
           
            if (orderDTO.getOrderQuantity() <= medicine.getQuantityInStock()) {
                OrderManagement order = new OrderManagement();
                order.setMedicine(medicine);
                order.setOrderQuantity(orderDTO.getOrderQuantity());
                order.setOrderDate(orderDTO.getOrderDate());
                orderRepository.save(order);
                
                // Update the stock quantity after the order is placed
                medicine.setQuantityInStock(medicine.getQuantityInStock() - orderDTO.getOrderQuantity());
                inventoryRepository.save(medicine);
            } else {
                throw new RuntimeException("Insufficient stock for the requested quantity.");
            }
        } else{
            throw new RuntimeException("Medicine with ID " + orderDTO.getMedicineId() + " not found.");
        }
    }

    public void updateOrder(Long orderId, OrderDTO orderDTO) {
    	Optional<OrderManagement> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isPresent()) {
            OrderManagement existingOrder = optionalOrder.get();

            
            existingOrder.setOrderQuantity(orderDTO.getOrderQuantity());
            existingOrder.setOrderDate(orderDTO.getOrderDate());
            orderRepository.save(existingOrder);
        } else {
            throw new RuntimeException("Order with ID " + orderId + " not found.");
        }
    }

    public void cancelOrder(Long orderId) {
        orderRepository.deleteById(orderId);
       
    }

    public List<OrderManagement> getAllOrders() {
        List<OrderManagement> od =orderRepository.findAll();
        return od;
    }
}
