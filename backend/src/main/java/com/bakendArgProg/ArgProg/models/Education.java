package com.bakendArgProg.ArgProg.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Education {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long idEdu;
    private String tituloEdu;
    private int fechaInitEdu;
    private int fechaEndEdu;
    private String descriptionEdu;

    public Education() {

    }

    public Education(Long idEdu, String tituloEdu, int fechaInitEdu, int fechaEndEdu, String descriptionEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaInitEdu = fechaInitEdu;
        this.fechaEndEdu = fechaEndEdu;
        this.descriptionEdu = descriptionEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaInitEdu() {
        return fechaInitEdu;
    }

    public void setFechaInitEdu(int fechaInitEdu) {
        this.fechaInitEdu = fechaInitEdu;
    }

    public int getFechaEndEdu() {
        return fechaEndEdu;
    }

    public void setFechaEndEdu(int fechaEndEdu) {
        this.fechaEndEdu = fechaEndEdu;
    }

    public String getDescriptionEdu() {
        return descriptionEdu;
    }

    public void setDescriptionEdu(String descriptionEdu) {
        this.descriptionEdu = descriptionEdu;
    }
}
