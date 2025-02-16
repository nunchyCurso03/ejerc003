package es.santander.ascender.ejerc003.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.santander.ascender.ejerc003.model.Boligrafo;
import es.santander.ascender.ejerc003.service.BoligrafoService;

@RestController
@RequestMapping("/api/boligrafo")
public class BoligrafoController {

    @Autowired
    private BoligrafoService boligrafoService;
    
    @PostMapping    
    public Boligrafo create(@RequestBody Boligrafo boligrafo){
       return boligrafoService.create(boligrafo);
    }

    @GetMapping("/{id}")
    public Boligrafo read(@PathVariable("id") Long id){
        return boligrafoService.read(id);
    }

    @GetMapping
    public List<Boligrafo> list(){
        return boligrafoService.read();
    }

    @PutMapping
    public Boligrafo update(@RequestBody Boligrafo boligrafo){
        return boligrafoService.update(boligrafo);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        boligrafoService.delete(id);
    }
}
