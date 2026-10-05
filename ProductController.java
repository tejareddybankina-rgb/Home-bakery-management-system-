package com.bakery.controller;
import com.bakery.model.Product;
import com.bakery.service.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController @RequestMapping("/api/products")
public class ProductController {
 private final ProductService service;
 public ProductController(ProductService service){this.service=service;}
 @GetMapping public List<Product> all(){return service.findAll();}
 @PostMapping public Product create(@RequestBody Product p){return service.save(p);}
 @DeleteMapping("/{id}") public void delete(@PathVariable Long id){service.delete(id);}
}
