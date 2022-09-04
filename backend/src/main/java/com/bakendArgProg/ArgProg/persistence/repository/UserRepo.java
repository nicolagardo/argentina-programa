package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findAllByNameUser(String name);
    Optional<User> findByEmailUser(String emailUser);
    boolean existsByNameUser(String userName);
    boolean existsByEmailUser(String emailUser);

}
