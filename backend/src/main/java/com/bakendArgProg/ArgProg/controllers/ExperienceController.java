package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.models.Experience;
import com.bakendArgProg.ArgProg.services.ExperienceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/experiences")

public class ExperienceController {
    private final ExperienceService experienceService;

    public ExperienceController(ExperienceService experienceService) {
        this.experienceService = experienceService;
    }
    @GetMapping("")
    public ResponseEntity<List<Experience>> getExperience() {
        List<Experience> experience = experienceService.experienceList();
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }
    @PostMapping("")
    public  ResponseEntity<Experience> addExperience(@RequestBody Experience experience) {
        Experience experiencePost = experienceService.addExperience(experience);
        return new ResponseEntity<>(experiencePost, HttpStatus.CREATED);
    }
    @PutMapping("")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience) {
        Experience experiencePut = experienceService.updateExperience(experience);
        return new ResponseEntity<>(experiencePut, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Experience> deleteExp(@PathVariable("id") Long id) {
        experienceService.deleteExperience(id);
       return new ResponseEntity<>(HttpStatus.OK);
    }

}
