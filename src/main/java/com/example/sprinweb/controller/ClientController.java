package com.example.sprinweb.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprinweb.models.ClientModel;
import com.example.sprinweb.repository.ClientRepository;

@RestController
@RequestMapping("/clients")
public class ClientController {
    
    private final ClientRepository clientRepository;
   
    public ClientController(ClientRepository clientRepository){
        this.clientRepository=clientRepository;
    }

    @GetMapping
    public List<ClientModel> getClients(){
        return clientRepository.findAll();
    }
}
