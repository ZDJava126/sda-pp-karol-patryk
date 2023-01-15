package com.sda.model;

import jakarta.persistence.Id;
import lombok.*;

import java.security.PrivateKey;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private Integer age;
    private String email;


}


