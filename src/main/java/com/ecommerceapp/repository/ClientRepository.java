package com.ecommerceapp.repository;

import com.ecommerceapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository <Client, Integer> {
}
