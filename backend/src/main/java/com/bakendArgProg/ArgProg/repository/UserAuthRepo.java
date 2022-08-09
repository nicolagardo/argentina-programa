package com.bakendArgProg.ArgProg.repository;

import com.bakendArgProg.ArgProg.models.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthRepo extends JpaRepository<UserAuth, Long> {

}
