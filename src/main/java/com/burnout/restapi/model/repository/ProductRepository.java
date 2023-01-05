package com.burnout.restapi.model.repository;

import com.burnout.restapi.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {
    List<Product> findByNameContains(String name);
}