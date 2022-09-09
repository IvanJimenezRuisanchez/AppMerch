package com.ecommerceapp.repository;

import com.ecommerceapp.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
}
