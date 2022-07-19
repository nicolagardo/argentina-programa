package com.bakendArgProg.ArgProg.controllers;

import com.bakendArgProg.ArgProg.models.Skill;
import com.bakendArgProg.ArgProg.services.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skills")



public class SkillController {
    private final SkillService skService;

    public SkillController(SkillService skService) {
        this.skService = skService;
    }

    @GetMapping()
    public ResponseEntity<List<Skill>> getSkills() {
        List<Skill> skill =skService.skillList();
        return new ResponseEntity<>( skill, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Skill> postSkill(@RequestBody Skill skillAdd) {
        Skill skillPost = skService.addSkill(skillAdd);
        return new ResponseEntity<>(skillPost, HttpStatus.CREATED);
    }

    @PutMapping()
    public ResponseEntity<Skill> putSkill(@RequestBody Skill skillUpdate) {
        Skill skillPut = skService.updateSkill(skillUpdate);
        return new ResponseEntity<>(skillPut, HttpStatus.OK);
    }
    @DeleteMapping()
    public ResponseEntity<Skill> deleteSkill(@PathVariable("id") Long id) {
        skService.deleteSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
