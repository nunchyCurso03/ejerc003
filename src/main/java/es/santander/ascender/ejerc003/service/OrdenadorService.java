package es.santander.ascender.ejerc003.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc003.model.Ordenador;
import es.santander.ascender.ejerc003.repository.OrdenadorRepository;

@Service
public class OrdenadorService {

    @Autowired
    private OrdenadorRepository  repository;

    public Ordenador create(Ordenador ordenador) {
        if (ordenador.getId() != null) {
            throw new CrudSecurityException("No se puede crear un ordenador con un ID preexistente.",
            CRUDOperation.CREATE,
            ordenador.getId());
        }
        return repository.save(ordenador);
    }

    public Ordenador read(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Ordenador> read() {
        return repository.findAll();
    }
    
    public Ordenador update(Ordenador ordenador) {
        if (ordenador.getId() == null) {
            throw new CrudSecurityException ("No se puede actualizar un ordenador sin ID.",
            CRUDOperation.UPDATE,
            null);
        }
        return repository.save(ordenador);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

}
