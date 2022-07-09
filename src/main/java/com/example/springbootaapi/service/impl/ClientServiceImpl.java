package com.example.springbootaapi.service.impl;

import com.example.springbootaapi.exception.ResourceNotFoundException;
import com.example.springbootaapi.model.Client;
import com.example.springbootaapi.repository.ClientRepository;
import com.example.springbootaapi.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    public ClientServiceImpl(ClientRepository clientRepository) {

        this.clientRepository = clientRepository;
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Client getClientById(long id) {
        return clientRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("client","Id",id));
    }

    @Override
    public Client updateClient(Client client, long id) {
        // we need to check whether Clients with given id is exist in DB or not
        Client existingClient = clientRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Client","Id", id));

        existingClient.setClientName(client.getClientName());
        existingClient.setClientLastName(client.getClientLastName());
        existingClient.setClientMobile(client.getClientMobile());
        // save existing client to DB
        clientRepository.save(existingClient);
        return existingClient;
    }
}