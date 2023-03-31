package com.goweb.springexercise.gcurest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final List<User> users = new ArrayList<>(
            Arrays.asList(
                    new User(1L, "gasoon", new Date()),
                    new User(2L, "kakao", new Date()),
                    new User(3L, "kason", new Date()),
                    new User(4L, "heycacao", new Date()),
                    new User(5L, "gachon", new Date()))
    );

     List<User> findAll() {
        return users;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id)
                return user;
        }
        return null;
    }

    public List<User> updateUser(int id, UpdateRequest updateRequest) {
        for (User user : users) {
            if (user.getId() == id)
                user.setName(updateRequest.getName());
        }
        return users;
    }

}
