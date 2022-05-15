package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.models.Education;
import com.bakendArgProg.ArgProg.models.User;
import com.bakendArgProg.ArgProg.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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


    public  User updateUser(User user) {
        return educationUser.save(user);
    }
    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }

}
