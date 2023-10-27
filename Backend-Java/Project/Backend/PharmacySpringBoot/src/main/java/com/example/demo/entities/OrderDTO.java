package com.example.demo.entities;

import java.util.Date;

public class OrderDTO {
    private Long medicineId;
    private int orderQuantity;
    private Date orderDate;

  

    public OrderDTO() {
    }

    public OrderDTO(Long medicineId, int orderQuantity, Date orderDate) {
        this.medicineId = medicineId;
        this.orderQuantity = orderQuantity;
        this.orderDate = orderDate;
    }

    public Long getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Long medicineId) {
        this.medicineId = medicineId;
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

}
