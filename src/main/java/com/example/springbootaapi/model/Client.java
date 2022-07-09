package com.example.springbootaapi.model;


import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "clientname", nullable = false)
    private String clientName;

    @Column(name = "clientlastname")
    private String ClientLastName;

    @Column(name = "clientmobile")
    private String clientMobile;



}
