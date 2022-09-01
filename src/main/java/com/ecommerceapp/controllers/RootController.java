package com.ecommerceapp.controllers;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.dto.EmailDto;
import com.ecommerceapp.dto.LoginDto;
import com.ecommerceapp.service.EmailService;
import com.ecommerceapp.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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
        EmailDto succ= new EmailDto(loginDto.getEmail(),"Login Successful Login","Login",null);
        EmailDto fail= new EmailDto(loginDto.getEmail(),"Login","Login Fail",null);
        if(serviceClient.login(loginDto.getEmail(), loginDto.getPassWord())){
            emailService.sendSimpleMail(succ);
        }
        else {
            emailService.sendSimpleMail(fail);
        }
        System.out.println("Correo enviado");
    }


}
