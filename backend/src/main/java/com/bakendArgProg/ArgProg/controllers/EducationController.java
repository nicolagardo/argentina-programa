package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.models.Education;
import com.bakendArgProg.ArgProg.services.EducationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/education")

public class EducationController {
    private final EducationService educationService;

    public EducationController(EducationService educationService) {
        this.educationService = educationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducation(@PathVariable("id") Long id) {
        Education educacion = educationService.getEducation(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }
    @GetMapping("")
    public  ResponseEntity<List<Education>> getAllEdu() {
        List<Education> ListEdu =educationService.educationList();
        return new ResponseEntity<>(ListEdu, HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Education> putEducation(@RequestBody Education education) {
        Education educationUpdate = educationService.updateEducation(education);
        return new ResponseEntity<>(educationUpdate, HttpStatus.OK);
    }
    @PostMapping("/")
    public ResponseEntity<Education> postEducation(@RequestBody Education education) {
        Education educationPost = educationService.addEducation(education);
        return new ResponseEntity<>(educationPost, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long id) {
        educationService.deleteEducation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
