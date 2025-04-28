// src/main/java/com/example/demo/controller/ProductController.java

package com.example.demo.controller;

import com.example.demo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getAllProducts() {
        return Arrays.asList(
            new Product(1L, "Sản phẩm A", 100.0),
            new Product(2L, "Sản phẩm B", 200.0),
            new Product(3L, "Sản phẩm C", 300.0)
        );
    }
}
