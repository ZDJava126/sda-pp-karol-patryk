package com.sda.model;

import jakarta.persistence.Id;

public class User {
    @Id
    String username;
    String password;
    String name;
    String surname;
   Integer age;
   String email;


    }


