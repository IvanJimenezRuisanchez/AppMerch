package com.ecommerceapp.repository;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface ClientRepository extends JpaRepository <Client, Integer> {
    @Query(value = "SELECT cl from Client cl WHERE upper(cl.email) = :email")
    Client getClientByEmail(@Param("email") String email);
}
