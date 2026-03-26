package com.example.productservice.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    // Test API
    @GetMapping("/hello")
    public String hello() {
        return "Product Service is running!";
    }

    // Get product by ID (dummy response)
    @GetMapping("/{id}")
    public String getProductById(@PathVariable Long id) {
        return "Fetching product with ID: " + id;
    }

    // Create product (dummy)
    @PostMapping
    public String createProduct(@RequestBody String product) {
        return "Product created: " + product;
    }
}