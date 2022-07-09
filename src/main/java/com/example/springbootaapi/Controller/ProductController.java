package com.example.springbootaapi.Controller;


import com.example.springbootaapi.model.Product;
import com.example.springbootaapi.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // build create Product REST API
    @PostMapping()
    public ResponseEntity<Product> saveProduct(@RequestBody Product product){
        return new ResponseEntity<Product>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    // build get all Products Rest API
    @GetMapping()
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

    // build get by id Products by id REST API
    // http://localhost:8080/api/products/1
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") long productId){
        return new ResponseEntity<Product>(productService.getProductById(productId), HttpStatus.OK);

    }

    // build update Product REST API
    // http://localhost:8080/api/products/1
    @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") long id,@RequestBody Product product)
    {
        return new ResponseEntity<Product>(productService.updateProduct(product, id), HttpStatus.OK);
    }
}

