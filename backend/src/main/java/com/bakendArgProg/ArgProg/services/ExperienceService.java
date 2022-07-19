package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.models.Experience;
import com.bakendArgProg.ArgProg.repository.ExperienceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ExperienceService {

    private final ExperienceRepo experienciaServ;

    @Autowired
    public ExperienceService(ExperienceRepo experienceServ) { this.experienciaServ = experienceServ;}

    public Experience addExperience(Experience experiencia) { return experienciaServ.save(experiencia); }

    public List<Experience> experienceList() { return experienciaServ.findAll();}

    public Experience updateExperience(Experience experiencia) { return experienciaServ.save(experiencia);}

    public void deleteExperience(Long id) { experienciaServ.deleteById(id);}


}
