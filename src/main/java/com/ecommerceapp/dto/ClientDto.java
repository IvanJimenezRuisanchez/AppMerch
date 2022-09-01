package com.ecommerceapp.dto;

import com.ecommerceapp.model.Client;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class ClientDto {
    public ClientDto(String firstName, String lastName, String email, String passWord) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.passWord = passWord;
    }

    private String firstName;
    private String lastName;
    private String email;
    private String passWord;

    public ClientDto(){}

    public Client toClient(String firstName, String lastName, String email, String passWord){
        return new Client(firstName,lastName,email,passWord);
    }

}
