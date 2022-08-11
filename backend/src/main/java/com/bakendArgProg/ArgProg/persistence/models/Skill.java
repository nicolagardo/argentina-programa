package com.bakendArgProg.ArgProg.persistence.models;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idSkill;
    private String nombreSkill;
    private String imageSkill;
    private  int percentSkill;

    public Skill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public Skill(Long idSkill, String nombreSkill, String imageSkill, int percentSkill) {
        this.idSkill = idSkill;
        this.nombreSkill = nombreSkill;
        this.imageSkill = imageSkill;
        this.percentSkill = percentSkill;
    }

    public Skill() {

    }

    public Long getIdSkill() {
        return idSkill;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkill = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public String getImageSkill() {
        return imageSkill;
    }

    public void setImageSkill(String imageSkill) {
        this.imageSkill = imageSkill;
    }

    public int getPercentSkill() {
        return percentSkill;
    }

    public void setPercentSkill(int percentSkill) {
        this.percentSkill = percentSkill;
    }
}
