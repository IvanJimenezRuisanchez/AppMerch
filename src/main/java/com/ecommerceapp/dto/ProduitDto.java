package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class ProduitDto {
    public ProduitDto(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    private double prix;
    private String nom;
}
