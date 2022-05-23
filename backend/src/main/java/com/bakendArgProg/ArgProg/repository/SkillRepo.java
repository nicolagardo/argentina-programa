package com.bakendArgProg.ArgProg.repository;

import com.bakendArgProg.ArgProg.models.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill, Long> {
}
