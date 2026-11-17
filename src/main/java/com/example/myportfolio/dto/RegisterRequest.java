package com.example.myportfolio.dto;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterRequest {

    @NotBlank @Size(min = 3, max = 20)
    private String username;

    @Email
    private String email;

    @Size(min = 8, message = "Must be at least 8 characters")
    private String password;
}