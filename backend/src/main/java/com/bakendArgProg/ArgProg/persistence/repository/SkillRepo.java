package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill, Long> {
}
