package com.bakendArgProg.ArgProg.persistence.models;






import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @Column(unique = true)
    @NotNull
    private String nameUser;

    @NotNull
    private  String password;
    @NotNull
    @Column(unique = true)
    private String emailUser;
    @NotNull
    private String titleUser;
    @NotNull
    private String descriptionUser;
    @NotNull
    private String imageUser;
    @NotNull
    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User() {

    }


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

    //public User(String name, String nameUser, String email, String password) {
    //}

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public User(String name, String lastName, String nameUser, String password, String emailUser, String titleUser, String descriptionUser, String imageUser) {
        this.name = name;
        this.lastName = lastName;
        this.nameUser = nameUser;
        this.password = password;
        this.emailUser = emailUser;
        this.titleUser = titleUser;
        this.descriptionUser = descriptionUser;
        this.imageUser = imageUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
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
        return lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
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
        return imageUser;
    }

    public void setImageuser(String imageuser) {
        this.imageUser = imageuser;
    }
}
