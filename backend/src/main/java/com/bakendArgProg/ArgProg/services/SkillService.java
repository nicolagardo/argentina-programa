package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.models.Skill;
import com.bakendArgProg.ArgProg.repository.SkillRepo;

import java.util.List;

public class SkillService {

        private final SkillRepo conocimientosRepo;

    public SkillService(SkillRepo conocimientosR) {
        this.conocimientosRepo = conocimientosR;
    }
    public Skill addSkill(Skill skill) { return conocimientosRepo.save(skill);}

    public List<Skill> skillList() { return conocimientosRepo.findAll();}

    public Skill updateSkill(Skill skill) { return  conocimientosRepo.save(skill);}

    public void deleteSkill(Long id) { conocimientosRepo.deleteById(id);}


}
