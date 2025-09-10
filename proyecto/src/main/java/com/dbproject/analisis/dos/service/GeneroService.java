package com.dbproject.analisis.dos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dbproject.analisis.dos.model.entity.Genero;
import com.dbproject.analisis.dos.model.repository.GeneroRepository;

@Service
public class GeneroService {

    private final GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public List<Genero> findAll() {
        return generoRepository.findAll();
    }

    public Optional<Genero> findById(Integer id) {
        return generoRepository.findById(id);
    }

    public Genero save(Genero genero) {
        return generoRepository.save(genero);
    }

    public void deleteById(Integer id) {
        generoRepository.deleteById(id);
    }

}
