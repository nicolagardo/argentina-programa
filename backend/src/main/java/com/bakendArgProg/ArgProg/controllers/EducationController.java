package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.models.Education;
import com.bakendArgProg.ArgProg.models.Experience;
import com.bakendArgProg.ArgProg.services.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/education")

public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Education> getEducation(@PathVariable("id") Long id) {
        Education educacion = educationService.getEducation(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Education> putEducation(@RequestBody Education education) {
        Education educationUpdate = educationService.updateEducation(education);
        return new ResponseEntity<>(educationUpdate, HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Education> deleteEducation(@PathVariable("id") Long id) {
        Education deleteEdu = educationService.deleteEducation(id);
        return new ResponseEntity<>(deleteEdu, HttpStatus.OK)
    }

}
