package com.example.springbootaapi.model;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "saleClient", nullable = false)
    private String saleClient;

    @Column(name = "saleSeller")
    private String saleSeller;

    @Column(name = "saleTotal")
    private float saleTotal;

    @Column(name = "saleDate")
    private String saleDate;

    @OneToMany(targetEntity = Client.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private List<Client> clients;



}
