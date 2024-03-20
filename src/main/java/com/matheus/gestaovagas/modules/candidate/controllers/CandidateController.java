package com.matheus.gestaovagas.modules.candidate.controllers;

import com.matheus.gestaovagas.modules.candidate.CandidateEntity;
import com.matheus.gestaovagas.modules.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;


    @PostMapping("/")
    public CandidateEntity create(@Validated @RequestBody CandidateEntity candidateEntity ) {
        return this.candidateRepository.save(candidateEntity);
    }
}
