package com.goweb.springexercise.gcurest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserRest {
    private final UserService userService;

    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findOneUser(@PathVariable("id") int id) {
        return userService.findOne(id);

    }

    @PatchMapping("/{id}")
    public List<User> updateUser(@PathVariable("id") int id, @RequestBody UpdateRequest updateRequest) {
        return userService.updateUser(id, updateRequest);
    }
}
