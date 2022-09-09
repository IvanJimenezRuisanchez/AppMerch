package com.ecommerceapp.controllers;

import com.ecommerceapp.dto.*;
import com.ecommerceapp.service.EmailService;
import com.ecommerceapp.service.ServiceClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
        serviceClient.login(loginDto.getEmail(),loginDto.getPassWord());
    }

    @PostMapping(value = "/resetPassword")
    @CrossOrigin(origins = "http://localhost:8080")
    public void resetPassword(@RequestBody final LoginDto loginDto) {
        ClientDto clientDto = serviceClient.getClientDto(loginDto.getEmail());
        UUID uuid = clientDto.getUuid();
        String msgBody = "Salut!, "+clientDto.getFirstName()+" "+ clientDto.getLastName() +" Mot de passe oublié?"+'\n'+
                "Nous avons reçu une demande de réinitialisation du mot de passe de votre compte."+'\n'+'\n'+'\n'+'\n'+
        "Pour réinitialiser votre mot de passe, saisissez le token suivant sur la page de validation : "+ uuid;
        emailService.sendSimpleMail(new EmailDto( loginDto.getEmail(),msgBody,"Réinitialisation du mot de passe",null));
    }

    @PostMapping(value = "/updatePassword")
    @CrossOrigin(origins = "http://localhost:8080")
    public void changePassWord(@RequestBody final ChangePasswordDto changePasswordDto) {
        serviceClient.resetPassword(changePasswordDto.getPassWord(), changePasswordDto.getKey());
    }

    @GetMapping(value = "/products")
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public List<ProduitDto> getProducts() {
        return serviceClient.getAllProduit();
    }

    @GetMapping(value = "/productsByName")
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public List<ProduitDto> getProductsByName(@RequestParam("nom") String nom) {
        System.out.println(nom);
        System.out.println(serviceClient.getProductsByName(nom));
        return serviceClient.getProductsByName(nom);
    }

    @GetMapping(value = "/productsByCategory")
    @CrossOrigin(origins = "http://localhost:8080")
    @ResponseBody
    public List<ProduitDto> getProductsByCategorie(@RequestParam("categorie") String categorie) {
        System.out.println(categorie);
        return serviceClient.getProductsByCategorie(categorie);
    }

}
