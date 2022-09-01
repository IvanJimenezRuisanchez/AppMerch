package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

@Data
@JsonAutoDetect
public class LoginDto {
    public LoginDto(String email, String passWord) {
        this.email = email;
        this.passWord = passWord;
    }

    private String email;
    private String passWord;
}
