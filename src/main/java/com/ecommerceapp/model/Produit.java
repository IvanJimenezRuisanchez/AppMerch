package com.ecommerceapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;



    private double prix;
    private String nom;

    public Produit(long id, double prix, String nom, String categorie) {
        this.id = id;
        this.prix = prix;
        this.nom = nom;
        this.categorie = categorie;
    }

    private String categorie;
}
