package com.bakendArgProg.ArgProg.persistence.models;

import com.bakendArgProg.ArgProg.utils.enums.RoleUser;
import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RoleUser roleUser;

    public Role() {
    }

    public Role(@NotNull RoleUser roleUser) {
        this.roleUser = roleUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RoleUser getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(RoleUser roleUser) {
        this.roleUser = roleUser;
    }
}
