package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class ProduitDto {


    public ProduitDto(double prix, String nom, String categorie, Long id) {
        this.prix = prix;
        this.nom = nom;
        this.categorie = categorie;
        this.id = id;
    }

    private double prix;
    private String nom;
    private String categorie;
    private Long id;
}
