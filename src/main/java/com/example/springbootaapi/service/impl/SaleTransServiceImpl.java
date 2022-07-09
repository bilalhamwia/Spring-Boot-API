package com.example.springbootaapi.service.impl;


import com.example.springbootaapi.model.Sale;
import com.example.springbootaapi.repository.SaleTranRepository;
import com.example.springbootaapi.service.SaleTransService;
import org.springframework.stereotype.Service;

@Service
public class SaleTransServiceImpl implements SaleTransService {

    private SaleTranRepository saleTranRepository;

    public SaleTransServiceImpl(SaleTranRepository saleTranRepository) {
        super();
        this.saleTranRepository = saleTranRepository;
    }

    @Override
    public Sale saveTransSale(Sale sale) {
        return saleTranRepository.save(sale);
    }
}
