package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class ProduitDto {


    public ProduitDto(double prix, String nom, String categorie) {
        this.prix = prix;
        this.nom = nom;
        this.categorie = categorie;
    }

    private double prix;
    private String nom;
    private String categorie;
}
