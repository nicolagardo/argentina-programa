package com.bakendArgProg.ArgProg.models;

import javax.persistence.*;

@Entity
@Table(name = "experiences")
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long idExp;
    private String tituloExp;
    private int fechaInitExp;
    private int fechaEndExp;
    private String descriptionExp;

    public Experience() {
    }

    public Experience(Long idExp, String tituloExp, int fechaInitExp, int fechaEndExp, String descriptionExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaInitExp = fechaInitExp;
        this.fechaEndExp = fechaEndExp;
        this.descriptionExp = descriptionExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaInitExp() {
        return fechaInitExp;
    }

    public void setFechaInitExp(int fechaInitExp) {
        this.fechaInitExp = fechaInitExp;
    }

    public int getFechaEndExp() {
        return fechaEndExp;
    }

    public void setFechaEndExp(int fechaEndExp) {
        this.fechaEndExp = fechaEndExp;
    }

    public String getDescriptionExp() {
        return descriptionExp;
    }

    public void setDescriptionExp(String descriptionExp) {
        this.descriptionExp = descriptionExp;
    }
}
