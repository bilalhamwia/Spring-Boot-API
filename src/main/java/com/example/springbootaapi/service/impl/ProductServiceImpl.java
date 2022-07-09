package com.example.springbootaapi.service.impl;

import com.example.springbootaapi.exception.ResourceNotFoundException;
import com.example.springbootaapi.model.Product;
import com.example.springbootaapi.repository.ProductRepository;
import com.example.springbootaapi.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;


    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(long id) {
      /* Optional<Product> product = productRepository.findById(id);

       if (product.isPresent()){
           return product.get();
       }
       else {
           throw new ResourceNotFoundException("Product","Id",id);
       }
       */
        return productRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("product","Id",id));
    }

    @Override
    public Product updateProduct(Product product, long id) {
        // we need to check whether Product with given id is exist in DB or not
        Product existingProduct = productRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Product","Id",id));

        existingProduct.setProductName(product.getProductName());
        existingProduct.setProductDscription(product.getProductDscription());
        existingProduct.setProductCategory(product.getProductCategory());
        existingProduct.setProductDate(product.getProductDate());
        //Save existing Product to DB
        productRepository.save(existingProduct);
        return existingProduct;
    }


}
