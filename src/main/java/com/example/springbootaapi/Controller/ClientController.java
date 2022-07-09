package com.example.springbootaapi.Controller;

import com.example.springbootaapi.model.Client;
import com.example.springbootaapi.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private ClientService clientService;

    public ClientController(ClientService clientService) {
        super();
        this.clientService = clientService;
    }

    // build create Client REST API
    @PostMapping()
    public ResponseEntity<Client> saveClient(@RequestBody Client client){
        return new ResponseEntity<Client>(clientService.saveClient(client), HttpStatus.CREATED);
    }

    // build create all Client REST API
    @GetMapping()
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    // build get Clients by ID REST API
    // http://localhoust:8080/api/clients/1
    @GetMapping("{id}")
    public ResponseEntity<Client> getClientById(@PathVariable("id") long clientId){
        return new ResponseEntity<Client>(clientService.getClientById(clientId), HttpStatus.OK);
    }

    // build update Clients REST API
    // http://localhost:8080/api/clients/1
    @PutMapping("{id}")
    public ResponseEntity<Client> updateClient(@PathVariable("id") long id, @RequestBody Client client){
        return new ResponseEntity<Client>(clientService.updateClient(client, id),HttpStatus.OK);
    }

}