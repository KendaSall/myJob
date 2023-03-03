package com.kenda.myjob.controller;

import com.kenda.myjob.dto.JobRequest;
import com.kenda.myjob.entity.Categorie;
import com.kenda.myjob.repository.CategorieRepository;
import com.kenda.myjob.repository.OffreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobController {
    @Autowired
    private CategorieRepository categorieRepository;

    @Autowired
    private OffreRepository offreRepository;

    @PostMapping("/publierJob")
    public Categorie publierJob(@RequestBody JobRequest request){
        return categorieRepository.save(request.getCategorie());
    }

    @GetMapping("/findAllJobs")
    public List<Categorie> findAllJobs(){
        return categorieRepository.findAll();
    }


}
