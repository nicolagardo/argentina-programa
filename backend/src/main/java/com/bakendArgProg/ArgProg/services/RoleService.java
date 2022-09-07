package com.bakendArgProg.ArgProg.services;

import com.bakendArgProg.ArgProg.persistence.models.Role;
import com.bakendArgProg.ArgProg.persistence.repository.RoleRepo;
import com.bakendArgProg.ArgProg.utils.enums.RoleUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RoleService {
    @Autowired
    RoleRepo roleRepo;
    public Optional<Role> getByRoleUser(RoleUser roleUser){
        return  roleRepo.findByRoleUser(roleUser);
    }

    public void save(Role role) {
        roleRepo.save(role);
    }
}
