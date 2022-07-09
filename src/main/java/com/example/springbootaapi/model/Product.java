package com.example.springbootaapi.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "productName", nullable = false)
    private String productName;

    @Column(name = "productDscription")
    private String productDscription;

    @Column(name = "productCategory")
    private String productCategory;

    @Column(name = "productDate")
    private String productDate;
}