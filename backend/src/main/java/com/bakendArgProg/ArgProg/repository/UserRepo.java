package com.bakendArgProg.ArgProg.repository;

import com.bakendArgProg.ArgProg.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
