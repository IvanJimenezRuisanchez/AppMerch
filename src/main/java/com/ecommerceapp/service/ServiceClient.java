package com.ecommerceapp.service;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.model.Client;
import com.ecommerceapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClient {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void enregistrerClient (String firstName,String lastName,String email,String passWord){
        passWord = passwordEncoder.encode(passWord);
        clientRepository.save(new Client(firstName,lastName,email,passWord));
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
}
