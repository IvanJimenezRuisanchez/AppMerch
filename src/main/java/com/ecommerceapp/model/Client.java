package com.ecommerceapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    private String firstName;

    public Client(String firstName, String lastName, String email, String passWord, UUID uuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.uuid = uuid;
    }

    private String lastName;
    @Column(unique = true)
    private String email;
    private String passWord;
    private UUID uuid;
}