package com.ecommerceapp.dto;

import com.ecommerceapp.model.Client;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import ognl.Token;

import java.util.UUID;

@Data
@JsonAutoDetect
public class ClientDto {


    private String firstName;
    private String lastName;
    private String email;
    private String passWord;

    public ClientDto(String firstName, String lastName, String email, String passWord, UUID uuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
        this.uuid = uuid;
    }

    private UUID uuid;

    public ClientDto(){}

    public Client toClient(String firstName, String lastName, String email, String passWord,UUID uuid){
        return new Client(firstName,lastName,email,passWord,uuid);
    }

}
