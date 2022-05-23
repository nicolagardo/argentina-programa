package com.bakendArgProg.ArgProg.repository;

import com.bakendArgProg.ArgProg.models.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepo extends JpaRepository<Experience, Long> {
}
