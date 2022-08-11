package com.bakendArgProg.ArgProg.services;



import com.bakendArgProg.ArgProg.persistence.models.Education;
import com.bakendArgProg.ArgProg.persistence.repository.EducationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class EducationService {
    private final EducationRepo educationRepo;

    @Autowired
    public EducationService(EducationRepo educationRepo) {
        this.educationRepo = educationRepo;
    }

    public Education addEducation(Education education){
        return educationRepo.save(education);
    }

    public Education getEducation(Long id) { return educationRepo.getById(id);}
    public List<Education> educationList() {
        return educationRepo.findAll();
    }
    public Education updateEducation(Education education) {
        return educationRepo.save(education);
    }
    public void deleteEducation(Long id) {
        educationRepo.deleteById(id);
    }



}
