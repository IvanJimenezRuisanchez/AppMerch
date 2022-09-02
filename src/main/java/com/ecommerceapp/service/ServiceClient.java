package com.ecommerceapp.service;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.model.Client;
import com.ecommerceapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceClient {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void enregistrerClient (String firstName,String lastName,String email,String passWord){
        UUID uuid = UUID.randomUUID();
        passWord = passwordEncoder.encode(passWord);
        Client client = new Client(firstName,lastName,email,passWord,uuid);
        clientRepository.save(client);
    }

    public boolean resetPassword(String passWord,String uuid){
        UUID uniqueKey = UUID.randomUUID();
        if(clientRepository.getClientByUuid(uuid) == null){
            return false;
        }
        else {
            Client client = clientRepository.getClientByUuid(uuid);
            client.setUuid(uniqueKey);
            clientRepository.save(client);
            return true;
        }
    }

    public ClientDto getClientDto(String email){
        Client client = clientRepository.getClientByEmail(email.toUpperCase());
        return clientToDto(client);
    }
    public boolean login(String email,String passWord){
        Client client = clientRepository.getClientByEmail(email.toUpperCase());
        boolean isClient = true;
        if(client == null){
            isClient = false;
        }
        else {
            if(!passwordEncoder.matches(passWord,client.getPassWord())){
                isClient = false;
            }
        }
        return isClient;
    }

    private ClientDto clientToDto(Client client){
        return  new ClientDto(client.getFirstName(),client.getLastName(),client.getEmail(),client.getPassWord(),client.getUuid());
    }
}
