package com.example.demo.service;
import com.example.demo.entities.Medicine;
import com.example.demo.entities.MedicineNotFoundException;
import com.example.demo.entities.Order;
import com.example.demo.entities.OrderNotFoundException;
import com.example.demo.repository.OrderRepository;
import jakarta.transaction.Transactional;
import com.example.demo.repository.MedicineRepository;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class OrderService {
	@Autowired
    private  OrderRepository orderRepository;
	@Autowired
    private  MedicineRepository medicineRepository;

  

    public Iterable<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository.findById(id).get();
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public void updateOrder(Long id, Order updatedOrder) throws OrderNotFoundException {
        if (orderRepository.existsById(id)) {
            updatedOrder.setOrderId(id);
            orderRepository.save(updatedOrder);
        }
        else {
        throw new OrderNotFoundException("Order with given id not found.");
        }
    }

    public void deleteOrder(Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
        }
    }
    @Transactional
    public void addMedicineToOrder(Long orderId, Long medicineId) throws OrderNotFoundException, MedicineNotFoundException {
        Order order1 = orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order not found"));
        Medicine medicine1 = medicineRepository.findById(medicineId).orElseThrow(() -> new MedicineNotFoundException("Medicine not found"));
            order1.getMedicines().add(medicine1);
            medicine1.getOrders().add(order1);
            orderRepository.save(order1);
            medicineRepository.save(medicine1);
    }
    @Transactional
    public void removeMedicineFromOrder(Long orderId, Long medicineId) throws OrderNotFoundException, MedicineNotFoundException {
        Order orderOptional = orderRepository.findById(orderId).orElseThrow(() -> new OrderNotFoundException("Order not found"));
        Medicine medicineOptional = medicineRepository.findById(medicineId).orElseThrow(() -> new MedicineNotFoundException("Medicine not found"));
        	orderOptional.getMedicines().remove(medicineOptional);
        	medicineOptional.getOrders().remove(orderOptional);
            orderRepository.save(orderOptional);
            medicineRepository.save(medicineOptional);
    }
   
    public Order enrollMedicineInOrder(Long orderId) throws MedicineNotFoundException, OrderNotFoundException {
       // Medicine medicine = medicineRepository.findById(medicineId)
         //                                 .orElseThrow(() -> new MedicineNotFoundException("Medicine not found"));
        Order order = orderRepository.findById(orderId)
                                       .orElseThrow(() -> new OrderNotFoundException("Order not found"));
        System.out.println(order);
        Set<Medicine> medicines=order.getMedicines();
        medicines.forEach(System.out::println);
        return order;
        //Set<Medicine> medicines=order.getMedicines();
      //  medicine.getOrders().add(order);
        //order.getMedicines().add(medicine);

        //medicineRepository.save(medicine);
        //orderRepository.save(order);
       // return order;
    }
    
}

