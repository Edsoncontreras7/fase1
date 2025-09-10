package com.dbproject.analisis.dos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbproject.analisis.dos.model.entity.Genero;
import com.dbproject.analisis.dos.service.GeneroService;

@RestController
@RequestMapping("/api/genero")
public class GeneroController {

    private final GeneroService generoService;

    public GeneroController(GeneroService generoService) {
        this.generoService = generoService;
    }

    @GetMapping
    public List<Genero> getAll() {
        return generoService.findAll();
    }

    @GetMapping("/{id}")
    public Genero getById(@PathVariable Integer id) {
        return generoService.findById(id).orElse(null);
    }

    @PostMapping
    public Genero create(@RequestBody Genero genero) {
        return generoService.save(genero);
    }

    @PutMapping("/{id}")
    public Genero update(@PathVariable Integer id, @RequestBody Genero genero) {
        genero.setIdGenero(id);
        return generoService.save(genero);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        generoService.deleteById(id);
    }

}
