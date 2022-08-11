package com.bakendArgProg.ArgProg.persistence.repository;

import com.bakendArgProg.ArgProg.persistence.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    Optional<User> findAllByUserName(String nameUser);
    Optional<User> findByEmailUser(String emailUser);
    boolean existsByUsername( String userName);
    boolean existsByEmail( String email);

}
