package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.exception.UserNotFoundException;
import com.bakendArgProg.ArgProg.persistence.models.User;
import com.bakendArgProg.ArgProg.persistence.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepo userRepo;




    /*@Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;

    }

     */




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
    public Optional<User> getByNameUser(String userName) {return userRepo.findAllByNameUser(userName);}
    public boolean existByNameUser(String nameUser) {return userRepo.existsByNameUser(nameUser);}
    public Optional<User> getByEmail(String email) {
        return userRepo.findByEmailUser(email);
    }
    public boolean existByEmail(String emailUser ) {
        return userRepo.existsByEmailUser(emailUser);
    }
    public void save(User user) {
        userRepo.save(user);
    }

}
