package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.exception.UserNotFoundException;
import com.bakendArgProg.ArgProg.persistence.models.UserAuth;
import com.bakendArgProg.ArgProg.persistence.repository.UserAuthRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserAuthService {
    private  final UserAuthRepo userAuthRepo;

    @Autowired
    public UserAuthService(UserAuthRepo userAuthRepo) {
        this.userAuthRepo = userAuthRepo;
    }
    public UserAuth getUserAuth(Long Userid) {return userAuthRepo.findById(Userid).orElseThrow(()-> new UserNotFoundException("Usuarioo"));}
}
