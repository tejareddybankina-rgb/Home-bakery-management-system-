package com.bakery.model;
import jakarta.persistence.*;
@Entity @Table(name="orders")
public class Order {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String customerName; private String customerPhone; private String productName; private int quantity; private String status="PENDING";
 public Order(){}
 public Long getId(){return id;} public String getCustomerName(){return customerName;} public void setCustomerName(String v){customerName=v;}
 public String getCustomerPhone(){return customerPhone;} public void setCustomerPhone(String v){customerPhone=v;}
 public String getProductName(){return productName;} public void setProductName(String v){productName=v;}
 public int getQuantity(){return quantity;} public void setQuantity(int v){quantity=v;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
