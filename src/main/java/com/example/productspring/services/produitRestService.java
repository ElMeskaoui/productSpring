package com.example.productspring.services;

import com.example.productspring.Repository.ProduitRepository;
import com.example.productspring.entities.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class produitRestService {
    @Autowired
    private ProduitRepository produitRepository;

    @GetMapping("/listProduit")
    public List<Produit> listProduit(){
        return produitRepository.findAll();
    }
    @GetMapping("/listProduit/{id}")
    public Produit listProduit(@PathVariable(name = "id") Long id){
        return produitRepository.findById(id).get();
    }
    @PutMapping("/listProduit/{id}")
    public Produit update(@PathVariable(name = "id") Long id,@RequestBody Produit p){
        p.setId(id);
        return produitRepository.save(p);
    }
    @PostMapping("/listProduit")
    public Produit save(@RequestBody Produit p){
        return produitRepository.save(p);
    }
    @DeleteMapping("/listProduit/{id}")
    public void Delete(@PathVariable(name = "id") Long id){
         produitRepository.deleteById(id);
    }
}
