package com.ecommerceapp.repository;

import com.ecommerceapp.dto.ClientDto;
import com.ecommerceapp.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;


public interface ClientRepository extends JpaRepository <Client, Integer> {
    @Query(value = "SELECT cl from Client cl WHERE upper(cl.email) = :data")
    Client getClientByEmail(@Param("data") String data);
    @Query(value = "SELECT cl.uuid from Client cl WHERE upper(cl.email) = :data")
    UUID getUuid(@Param("data") String data);
}
