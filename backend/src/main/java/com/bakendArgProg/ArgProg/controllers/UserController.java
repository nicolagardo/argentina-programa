package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.models.User;
import com.bakendArgProg.ArgProg.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private  final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id) {
        User user=userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<User> putUser(@RequestBody User user) {
        User updateeUser=userService.editUser(user);
        return new ResponseEntity<>(updateeUser, HttpStatus.OK);
    }
}
