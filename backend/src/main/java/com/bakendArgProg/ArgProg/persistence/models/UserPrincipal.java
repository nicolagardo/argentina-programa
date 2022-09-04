package com.bakendArgProg.ArgProg.persistence.models;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class  UserPrincipal implements UserDetails {
    private String name;

    private String lastName;
    private String nameUser;

    private  String emailUser;
    private String password;
    private String titleUser;
    private String descriptionUser;
    private String imageUser;
    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(String name, String nameuser, String lastName, String titleUser, String descriptionUser,
                         String imageUser, String emailUser, String password,
                         Collection<? extends GrantedAuthority> authorities) {
        this.name = name;
        this.emailUser = emailUser;
        this.lastName = lastName;
        this.nameUser = nameuser;
        this.titleUser = titleUser;
        this.password = password;
        this.descriptionUser = descriptionUser;
        this.imageUser = imageUser;
        this.authorities = authorities;
    }

    public static UserPrincipal build(User user) {
        List<GrantedAuthority> authorityList =
                user.getRoles().stream().map(role -> new SimpleGrantedAuthority( role
                        .getRoleUser().name())).collect(Collectors.toList());
        return new UserPrincipal(user.getName(), user.getNameUser(), user.getLastname(), user.getTitleUser(),
                user.getDescriptionUser(), user.getImageuser(), user.getEmailUser(), user.getPassword(), authorityList);
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
        return nameUser;
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

    public String getLastName() {
        return lastName;
    }

   // public String getNameUser() {return nameUser;}

    public String getEmailUser() {
        return emailUser;
    }

    public String getImageUser() {
        return imageUser;
    }


    public String getName() {
        return name;
    }

    public String getTitleUser() {
        return titleUser;
    }

    public String getDescriptionUser() {
        return descriptionUser;
    }


}
