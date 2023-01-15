package com.sda.dao;

import com.sda.model.User;
import org.junit.jupiter.api.Test;

public class UsersDAOTest {

    private final UsersDAO usersDAO = new UsersDAO();


    @Test
    void testCreateHappyPath() {
        String expectedUsername = "user1";
        //given
        User expectedUser = User.builder()
                .username(expectedUsername)
                .password("password")
                .name("name")
                .surname("surname")
                .email("example@gmail.com")
                .age(30).build();
        //when

        //then

    }
}
