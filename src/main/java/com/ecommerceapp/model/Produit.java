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

    public Produit(double prix, String nom) {
        this.prix = prix;
        this.nom = nom;
    }

    private double prix;
    private String nom;
}
