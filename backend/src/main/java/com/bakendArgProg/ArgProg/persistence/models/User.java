package com.bakendArgProg.ArgProg.persistence.models;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String lastname;
    @NotNull
    private  String password;
    @NotNull
    @Column(unique = true)

    private String emailUser;
    private String titleUser;
    private String descriptionUser;
    private String imageuser;
    @ManyToMany
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEdu")
    private List<Education> educationList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExp")
    private List<Experience> experienceList;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillList;

    public User() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public User(Long id, String name, String lastname, String password, String emailUser, Set<Role> roles, String titleUser, String descriptionUser, String imageUser) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.password = password;
        this.emailUser = emailUser;
        this.roles = roles;
        this.titleUser = titleUser;
        this.descriptionUser = descriptionUser;
        this.imageuser = imageUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String email) {
        this.emailUser = email;
    }
    public String getTitleUser() {
        return titleUser;
    }

    public void setTitleUser(String titleUser) {
        this.titleUser = titleUser;
    }

    public String getDescriptionUser() {
        return descriptionUser;
    }

    public void setDescriptionUser(String descriptionUser) {
        this.descriptionUser = descriptionUser;
    }

    public String getImageuser() {
        return imageuser;
    }

    public void setImageuser(String imageuser) {
        this.imageuser = imageuser;
    }
}
