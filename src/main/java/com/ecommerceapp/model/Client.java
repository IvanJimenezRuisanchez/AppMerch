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
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public Client(String firstName, String lastName, String email, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
    }

    private String firstName;
    private String lastName;
    private String email;
    private String passWord;
}