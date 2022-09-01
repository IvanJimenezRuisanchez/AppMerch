package com.ecommerceapp.controllers;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.dto.EmailDto;
import com.ecommerceapp.dto.LoginDto;
import com.ecommerceapp.model.Client;
import com.ecommerceapp.service.EmailService;
import com.ecommerceapp.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.UUID;

@RestController
@RequestMapping("api/")
public class RootController {
    Logger logger = LoggerFactory.getLogger(RootController.class);

    private ServiceClient serviceClient;
    private EmailService emailService;

    public RootController(ServiceClient serviceClient, EmailService emailService){
        this.serviceClient = serviceClient;
        this.emailService = emailService;
    }

    @PostMapping(value = "/createAccount")
    @CrossOrigin(origins = "http://localhost:8080")
    public void signup(@RequestBody final ClientDto clientDto) {
        serviceClient.enregistrerClient(clientDto.getFirstName(),clientDto.getLastName(),clientDto.getEmail(),clientDto.getPassWord());
    }

    @PostMapping(value = "/login")
    @CrossOrigin(origins = "http://localhost:8080")
    public void empreuntPost(@RequestBody final LoginDto loginDto) {
        if (serviceClient.login(loginDto.getEmail(),loginDto.getPassWord())){
            System.out.println("Login Succe");
        }
    }

    @PostMapping(value = "/resetPassword")
    @CrossOrigin(origins = "http://localhost:8080")
    public void resetPassword(@RequestBody final LoginDto loginDto) {
        ClientDto clientDto = serviceClient.getClientDto(loginDto.getEmail());
        UUID uuid = clientDto.getUuid();
        String msgBody = "Forgot your passWord?"+'\n'+
                "We received a request to reset the password for your account."+'\n'+'\n'+'\n'+'\n'+
        "To reset your password enter the next token on the validation page: "+ uuid;
        emailService.sendSimpleMail(new EmailDto( loginDto.getEmail(),msgBody,"Password Reset",null));
    }


}
