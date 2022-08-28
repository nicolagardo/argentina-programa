package com.bakendArgProg.ArgProg.persistence.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class  UserPrincipal implements UserDetails {
    private String name;
    private  String email;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(String name, String email, String password, Collection<? extends GrantedAuthority> authorities) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
    }

    public static UserPrincipal build(User user) {
        List<GrantedAuthority> authorityList =
                user.getRoles().stream().map(role -> new SimpleGrantedAuthority( role
                        .getRoleUser().name())).collect(Collectors.toList());
        return new UserPrincipal(user.getName(), user.getPassword(), user.getEmailUser(), authorityList);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }
//TODO: getter username no implementado
    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
