package com.architect.bff_aaa.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.architect.bff_aaa.model.APInterface;
import com.architect.bff_aaa.repository.APInterfaceRepository;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private APInterfaceRepository repository;

    @GetMapping("/interfaces")
    public List<APInterface> allInterfaces(){
        return repository.findAll();
    }

    @GetMapping("/interface/{name}")
    public List<APInterface> findByName(@PathVariable("name") String name){
        return repository.findByName(name);
    }

    @PostMapping("/interface")
    public APInterface createInterface(@RequestBody APInterface inter){
        return repository.save(inter);
    }

    @PutMapping("/interface/{id}")
    public APInterface updateInterface(@PathVariable int id, @RequestBody APInterface inter){
         return repository.save(inter);
    }

    @DeleteMapping("/interface/{id}")
    public void deletePerson(@PathVariable("id") Long id) {
        repository.deleteById(id);
    }
}
