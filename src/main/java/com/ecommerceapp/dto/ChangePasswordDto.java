package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;


@Data
@JsonAutoDetect
public class ChangePasswordDto {
    public ChangePasswordDto(String passWord, String key){
        this.passWord = passWord;
        this.key = key;
    }

    private String passWord;
    private String key;


}
