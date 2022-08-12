package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.persistence.models.User;
import com.bakendArgProg.ArgProg.services.UserAuthService;
import com.bakendArgProg.ArgProg.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
    private  final UserService userService;
    private final UserAuthService userAuthService;


    public UserController(UserService userService, UserAuthService userAuthService) {
        this.userService = userService;
        this.userAuthService = userAuthService;
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
    //@PostMapping("/auth")
    //public ResponseEntity<String> authUser(@RequestBody User user) {

        //UserAuth authUser();
        //authUser.setToken("token");
        //authUser.setMessage("Mensaje exitoso");
        //authUser.setId(1l);
        //authUser.setRole("ADMIN");
        //String pass = user.getPassword();
        //UserAuth user1 = userAuthService.getUserAuth(id);


      //  return new ResponseEntity<String>(pass,HttpStatus.OK);


    //}
}
