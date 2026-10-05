package com.bakery.service;
import com.bakery.model.Order;
import com.bakery.repository.OrderRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class OrderService {
 private final OrderRepository repo;
 public OrderService(OrderRepository repo){this.repo=repo;}
 public List<Order> findAll(){return repo.findAll();}
 public Order save(Order o){return repo.save(o);}
 public Order updateStatus(Long id,String status){
   Order o=repo.findById(id).orElseThrow();
   o.setStatus(status); return repo.save(o);
 }
}
