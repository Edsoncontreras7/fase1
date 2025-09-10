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
import com.dbproject.analisis.dos.model.entity.Sucursal;
import com.dbproject.analisis.dos.service.SucursalService;

@RestController
@RequestMapping("/api/sucursal")
public class SucursalController {

    private final SucursalService sucursalService;

    public SucursalController(SucursalService sucursalService) {
        this.sucursalService = sucursalService;
    }

    @GetMapping
    public List<Sucursal> getAll() {
        return sucursalService.findAll();
    }

    @GetMapping("/{id}")
    public Sucursal getById(@PathVariable Integer id) {
        return sucursalService.findById(id).orElse(null);
    }

    @PostMapping
    public Sucursal create(@RequestBody Sucursal sucursal) {
        return sucursalService.save(sucursal);
    }

    @PutMapping("/{id}")
    public Sucursal update(@PathVariable Integer id, @RequestBody Sucursal sucursal) {
        sucursal.setIdSucursal(id);
        return sucursalService.save(sucursal);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        sucursalService.deleteById(id);
    }

}
