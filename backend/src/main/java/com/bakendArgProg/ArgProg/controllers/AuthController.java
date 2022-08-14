package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.security.dtoSecurity.JwtDto;
import com.bakendArgProg.ArgProg.security.dtoSecurity.LoginUserDto;
import com.bakendArgProg.ArgProg.security.jwt.JwtProvider;
import com.bakendArgProg.ArgProg.services.RoleService;
import com.bakendArgProg.ArgProg.services.UserService;
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


public class AuthController {





}
