package com.bakery.controller;
import com.bakery.model.Order;
import com.bakery.service.OrderService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;
@RestController @RequestMapping("/api/orders")
public class OrderController {
 private final OrderService service;
 public OrderController(OrderService service){this.service=service;}
 @GetMapping public List<Order> all(){return service.findAll();}
 @PostMapping public Order create(@RequestBody Order o){return service.save(o);}
 @PutMapping("/{id}/status") public Order status(@PathVariable Long id,@RequestBody Map<String,String> body){return service.updateStatus(id,body.get("status"));}
}
