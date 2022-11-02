package org.vijaycode.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vijaycode.entity.Professional;
import org.vijaycode.repo.ProfessionalRepo;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepo professionalRepo;


    public Professional saveProfession(Professional professional) {
        return professionalRepo.save(professional);

    }

    public Professional getData() {
        return Professional.builder().empId(1).managerName("KK").projectNumber(23).build();
    }


}
