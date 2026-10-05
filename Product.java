package com.bakery.model;
import jakarta.persistence.*;
@Entity @Table(name="products")
public class Product {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 private String name; private String category; private double price; private int stock;
 public Product() {}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;}
 public String getCategory(){return category;} public void setCategory(String v){category=v;}
 public double getPrice(){return price;} public void setPrice(double v){price=v;}
 public int getStock(){return stock;} public void setStock(int v){stock=v;}
}
