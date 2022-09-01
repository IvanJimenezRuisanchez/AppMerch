package com.ecommerceapp.controllers;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.dto.LoginDto;
import com.ecommerceapp.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/")
public class RootController {
    Logger logger = LoggerFactory.getLogger(RootController.class);

    private ServiceClient serviceClient;

    public RootController(ServiceClient serviceClient){
        this.serviceClient = serviceClient;
    }

    @PostMapping(value = "/createAccount")
    @CrossOrigin(origins = "http://localhost:8080")
    public void signup(@RequestBody final ClientDto clientDto) {
        serviceClient.enregistrerClient(clientDto.getFirstName(),clientDto.getLastName(),clientDto.getEmail(),clientDto.getPassWord());
    }

    @PostMapping(value = "/login")
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public boolean empreuntPost(@RequestBody final LoginDto loginDto) {
        return serviceClient.login(loginDto.getEmail(), loginDto.getPassWord());
    }


}
