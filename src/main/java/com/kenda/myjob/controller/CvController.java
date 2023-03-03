package com.kenda.myjob.controller;

import com.kenda.myjob.entity.Cv;
import com.kenda.myjob.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CvController {

    @Autowired
    private CvService service;

    @PostMapping("/addCv")
    public Cv addProduct(@RequestBody Cv cv){
        return service.saveCv(cv); // Appel de la méthode saveProduct de ProductService pour sauvegarder le produit
    }

    @GetMapping("/cvs")
    public List<Cv> findAllCvs(){
        return service.getCvs(); // Appel de la méthode getProducts de ProductService pour récupérer tous les produits
    }

    @GetMapping("/cvs/{id}")
    public Cv findCvbyId(@PathVariable int id){
        return service.getCvById(id); // Appel de la méthode getProductById de ProductService pour récupérer le produit correspondant à l'id donné
    }

    @GetMapping("/cvs/{nom}")
    public Cv findCvbyName(@PathVariable String nom){
        return service.getCvByNom(nom); // Appel de la méthode getProductByName de ProductService pour récupérer le produit correspondant au nom donné
    }

    @PutMapping("/update")
    public Cv updateCv(@RequestBody Cv cv){
        return service.updateCv(cv); // Appel de la méthode updateProduct de ProductService pour mettre à jour le produit
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCv(@RequestBody int id){
        return service.deleteById(id); // Appel de la méthode deleteById de ProductService pour supprimer le produit correspondant à l'id donné
    }
}
