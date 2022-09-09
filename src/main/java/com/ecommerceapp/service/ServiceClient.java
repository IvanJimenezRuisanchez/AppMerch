package com.ecommerceapp.service;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.dto.ProduitDto;
import com.ecommerceapp.model.Client;
import com.ecommerceapp.model.Produit;
import com.ecommerceapp.repository.ClientRepository;
import com.ecommerceapp.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ServiceClient {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProduitRepository produitRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public void enregistrerClient (String firstName,String lastName,String email,String passWord){
        UUID newToken = UUID.randomUUID();
        passWord = passwordEncoder.encode(passWord);
        Client client = new Client(firstName,lastName,email,passWord,newToken);
        clientRepository.save(client);
        System.out.println("Inscription reussite");
    }

    public boolean resetPassword(String neWpassWord,String uuid){
        UUID newToken = UUID.randomUUID();
        UUID keyForChange = UUID.fromString(uuid);
        if(clientRepository.getClientByUuid(keyForChange) == null){
            System.out.println("Token invalide ou utlisateur invalide");
            return false;
        }
        else {
            Client client = clientRepository.getClientByUuid(keyForChange);
            System.out.println("Mot de passe avant: "+ passwordEncoder.encode(client.getPassWord()));
            client.setUuid(newToken);
            client.setPassWord(neWpassWord);
            clientRepository.save(client);
            System.out.println("Mot de passe apres: "+ neWpassWord);
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
        if(client == null && !passwordEncoder.matches(passWord,client.getPassWord())){
            isClient = false;
            System.out.println("Utilisateur non valide ou mot de passe non valide");
        }
        System.out.println("Connexion acceptee");
        return isClient;
    }

    private ClientDto clientToDto(Client client){
        return  new ClientDto(client.getFirstName(),client.getLastName(),client.getEmail(),client.getPassWord(),client.getUuid());
    }

    public List<ProduitDto> getAllProduit() {
        return toProduitDTOList(produitRepository.findAll());
    }

    private List<ProduitDto> toProduitDTOList(List<Produit> produits){
        List<ProduitDto> produitDtos = new ArrayList<>();
        for(Produit produit : produits){
            produitDtos.add(new ProduitDto(produit.getPrix(),produit.getNom(),produit.getCategorie()));
        }
        return produitDtos;
    }

    public List<ProduitDto> getProductsByName(String nom) {
        return toProduitDTOList(produitRepository.findByNom(nom.toUpperCase()));
    }

    public List<ProduitDto> getProductsByCategorie(String categorie) {
        return toProduitDTOList(produitRepository.findByCategorie(categorie.toUpperCase()));
    }
}
