package com.example.springbootaapi.Controller;


import com.example.springbootaapi.model.Sale;
import com.example.springbootaapi.service.SaleTransService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Transaction")
public class SaleTransController {

    private SaleTransService saleTransService;

    public SaleTransController(SaleTransService saleTransService) {
        this.saleTransService = saleTransService;
    }

    //build Create Sale Transaction REST API
    @PostMapping
    public ResponseEntity<Sale> saveTransactionSale(@RequestBody Sale sale){
        return new ResponseEntity<Sale>(saleTransService.saveTransSale(sale), HttpStatus.OK);

    }
}