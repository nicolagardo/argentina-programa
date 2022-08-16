package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.persistence.models.Role;
import com.bakendArgProg.ArgProg.persistence.models.User;
import com.bakendArgProg.ArgProg.security.dtoSecurity.JwtDto;
import com.bakendArgProg.ArgProg.security.dtoSecurity.LoginUserDto;
import com.bakendArgProg.ArgProg.security.dtoSecurity.NewUser;
import com.bakendArgProg.ArgProg.security.jwt.JwtProvider;
import com.bakendArgProg.ArgProg.services.RoleService;
import com.bakendArgProg.ArgProg.services.UserService;
import com.bakendArgProg.ArgProg.utils.enums.RoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin
public class AuthController {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @Autowired
    JwtProvider jwtProvider;
@PostMapping("/new")
public ResponseEntity<?> newUser(@Valid @RequestBody NewUser newUser, BindingResult bindingResult   ){
    if (bindingResult.hasErrors())
        return new ResponseEntity<>("algo salio mal",HttpStatus.BAD_REQUEST);
    if (userService.existByEmailUser(newUser.getNameUser()))
        return new ResponseEntity<>("Email ya existe",HttpStatus.BAD_REQUEST);
    User user =
            new User(newUser.getName(), newUser.getNameUser(), newUser.getEmail(),
                    passwordEncoder.encode(newUser.getPassword()));
    Set<Role> roles = new HashSet<>();
    roles.add(roleService.getByRoleUser(RoleUser.ROLE_USER).get());
    if (newUser.getRoles().contains("admin"))
        roles.add(roleService.getByRoleUser(RoleUser.ROLE_ADMIN).get());
    user.setRoles(roles);
    userService.save(user);
    return new ResponseEntity<>("Usuario guardado", HttpStatus.CREATED);
}
    @PostMapping("/login")
    public ResponseEntity<JwtDto> login (@Valid @RequestBody LoginUserDto loginUser, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return new ResponseEntity("algo salio mal",HttpStatus.BAD_REQUEST);
        Authentication authentication =
                authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getEmail(), loginUser.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        JwtDto jwtDto = new JwtDto(jwt, userDetails.getUsername(), userDetails.getAuthorities());
        return new ResponseEntity<>(jwtDto, HttpStatus.OK);


    }

}
