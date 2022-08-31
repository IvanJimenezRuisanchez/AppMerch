package com.ecommerceapp.service;

import com.ecommerceapp.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClient {
    @Autowired
    private ClientRepository clientRepository;
}
