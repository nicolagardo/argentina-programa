package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.exception.UserNotFoundException;
import com.bakendArgProg.ArgProg.models.User;
import com.bakendArgProg.ArgProg.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    private final UserRepo userRepo;


    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;

    }


    public User addUser(User user){
        return userRepo.save(user);
    }


    public  User editUser(User user) {
        return userRepo.save(user);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

    public User getUser(Long id) {

        return userRepo.findById(id).orElseThrow(() -> new UserNotFoundException("Usuario no encontrado"));
    }

}
