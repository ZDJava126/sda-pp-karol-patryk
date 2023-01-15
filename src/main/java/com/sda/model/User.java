package com.sda.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.security.PrivateKey;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity

public class User {
    private String username;
    private String password;
    private String name;
    private String surname;
    private Integer age;
    private String email;
    @Id
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}


