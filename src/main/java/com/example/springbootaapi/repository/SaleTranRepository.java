package com.example.springbootaapi.repository;


import com.example.springbootaapi.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleTranRepository extends JpaRepository<Sale, Long> {
}
