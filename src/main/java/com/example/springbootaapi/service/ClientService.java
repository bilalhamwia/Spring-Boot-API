package com.example.springbootaapi.service;

import com.example.springbootaapi.model.Client;

import java.util.List;

public interface ClientService {
    Client saveClient(Client client);

    List<Client> getAllClients();

    Client getClientById(long id);

    Client updateClient(Client client, long id);
}
