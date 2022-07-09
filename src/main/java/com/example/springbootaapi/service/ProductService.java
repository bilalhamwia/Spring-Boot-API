package com.example.springbootaapi.service;


import com.example.springbootaapi.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    List<Product> getAllProducts();

    Product getProductById(long id);

    Product updateProduct(Product product, long id);
}

