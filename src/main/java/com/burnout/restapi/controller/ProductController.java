package com.burnout.restapi.controller;

import com.burnout.restapi.model.entity.Product;
import com.burnout.restapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sound.sampled.Port;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping // BISA DIGUNAKAN UNTUK CREATE DAN UPDATE(HARUS ADA ID)
    public Product create(@RequestBody Product product) {
        return productService.create(product);
    }

    @GetMapping
    public Iterable<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findOne(@PathVariable("id") Long x) {
        return productService.findOne(x);
    }

    @PutMapping("/update/{id}")
    public Product update(@RequestBody Product product) {
        return productService.create(product);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long x) {
        productService.removeOne(x);
    }
}