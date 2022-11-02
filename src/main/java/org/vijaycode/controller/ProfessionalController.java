package org.vijaycode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.vijaycode.entity.Professional;
import org.vijaycode.service.ProfessionalService;

@RestController
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;


    @GetMapping("/profession")
    public Professional getData() {
        return professionalService.getData();
    }


    @PostMapping("/profession")
    public Professional saveData(@RequestBody Professional professional) {
        return professionalService.saveProfession(professional);
    }
}
