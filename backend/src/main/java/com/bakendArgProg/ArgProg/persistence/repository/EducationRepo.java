package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepo extends JpaRepository<Education, Long> {
}
