package com.example.demo.controller;
import com.example.demo.entities.Medicine;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderNotFoundException;
import com.example.demo.service.OrderService;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/allorder")
    public Iterable<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orderById/{id}")
    public Order getOrderById(@PathVariable Long id) throws OrderNotFoundException {
        return orderService.getOrderById(id);
    }

    @PostMapping("/createOrder")
    public Order createOrder(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PutMapping("/updateOrder/{id}")
    public void updateOrder(@PathVariable Long id, @RequestBody Order updatedOrder) throws OrderNotFoundException {
        orderService.updateOrder(id, updatedOrder);
    }

    @DeleteMapping("/deleteOrder/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
    }
    @PostMapping("/{orderId}/addMedicine/{medicineId}")
    public ResponseEntity<String> addMedicineToOrder(@PathVariable Long orderId, @PathVariable Long medicineId) {
        try {
            orderService.addMedicineToOrder(orderId, medicineId);
            return ResponseEntity.ok("Medicine added to order successfully");
        } catch (OrderNotFoundException | MedicineNotFoundException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }


    @PostMapping("/{orderId}/removeMedicine/{medicineId}")
    public void removeMedicineFromOrder(@PathVariable Long orderId, @PathVariable Long medicineId) throws OrderNotFoundException, MedicineNotFoundException {
        orderService.removeMedicineFromOrder(orderId, medicineId);
    }
    @GetMapping("/medicines/{orderId}")
    public Set<Medicine> getMedicineByOrder(@PathVariable Long orderId) throws OrderNotFoundException {
        return orderService.getMedicineByOrder(orderId);
    }
}

