package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.Role;
import com.bakendArgProg.ArgProg.utils.enums.RoleUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleUser(RoleUser roleUser);
}
