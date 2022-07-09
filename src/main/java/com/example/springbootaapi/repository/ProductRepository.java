package com.example.springbootaapi.repository;


import com.example.springbootaapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
