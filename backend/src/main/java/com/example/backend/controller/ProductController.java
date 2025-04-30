package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
public class ProductController {

    @GetMapping("/products")
    public List<Map<String, Object>> getProducts() {
        return Arrays.asList(
            Map.of("id", 1, "name", "Sản phẩm A", "price", 100000),
            Map.of("id", 2, "name", "Sản phẩm B", "price", 200000),
            Map.of("id", 3, "name", "Sản phẩm C", "price", 300000)
        );
    }
}
