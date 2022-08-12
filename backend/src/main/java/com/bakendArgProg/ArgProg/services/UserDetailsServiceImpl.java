package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.persistence.models.User;
import com.bakendArgProg.ArgProg.persistence.models.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserService userService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getByEmail(username).get();
        return UserPrincipal.build(user);
    }
}
