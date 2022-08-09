package com.bakendArgProg.ArgProg.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
@Entity
public class UserAuth implements Serializable {
    private  String message;
    private  String token;

    private  String role;
    private Long id;





    public UserAuth(String message, String token, Long id, String role) {
        this.message = message;
        this.token = token;
        this.id = id;
        this.role = role;

    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }



    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
