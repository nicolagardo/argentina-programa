package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.UserAuth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAuthRepo extends JpaRepository<UserAuth, Long> {

}
