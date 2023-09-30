package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    // Connect service to DB

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User( 1,"Sam", 34, "sam@mail.com");
        User user2 = new User( 2,"Tom", 39, "tom@mail.com");
        User user3 = new User( 3,"Bob", 18, "bob@mail.com");
        User user4 = new User( 4,"Ben", 42, "ben@mail.com");
        User user5 = new User( 5,"Mike", 45, "mike@mail.com");

        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional optional = Optional.empty();
        for (User user: userList) {
            if (id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
