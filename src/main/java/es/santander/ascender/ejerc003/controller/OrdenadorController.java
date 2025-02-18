package es.santander.ascender.ejerc003.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.santander.ascender.ejerc003.model.Ordenador;
import es.santander.ascender.ejerc003.service.OrdenadorService;

 

@RestController
@RequestMapping("/api/ordenador")
public class OrdenadorController {

    @Autowired
    private OrdenadorService ordenadorService;
    
    @PostMapping    
    public Ordenador create(@RequestBody Ordenador ordenador){
       return ordenadorService.create(ordenador);
    }

    @GetMapping("/{id}")
    public Ordenador read(@PathVariable("id") Long id){
        return ordenadorService.read(id);
    }

    @GetMapping
    public List<Ordenador> list(){
        return ordenadorService.read();
    }

    @PutMapping
    public Ordenador update(@RequestBody Ordenador ordenador){
        return ordenadorService.update(ordenador);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        ordenadorService.delete(id);
    }
}
