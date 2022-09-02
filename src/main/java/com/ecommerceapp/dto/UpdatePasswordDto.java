package com.ecommerceapp.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

import java.lang.ref.PhantomReference;
import java.util.UUID;

@Data
@JsonAutoDetect
public class UpdatePasswordDto {
    public UpdatePasswordDto(String key, String password) {
        this.key = key;
        this.password = password;
    }

    private String key;
    private String password;


}
