package com.ecommerceapp.repository;

import com.ecommerceapp.model.Client;
import com.ecommerceapp.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
    @Query(value = "SELECT p from Produit p WHERE upper(p.nom) = :data")
    List<Produit> findByNom(@Param("data") String data);
}
