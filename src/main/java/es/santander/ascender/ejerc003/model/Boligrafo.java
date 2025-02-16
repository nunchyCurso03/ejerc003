package es.santander.ascender.ejerc003.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BOLIGRAFO")
public class Boligrafo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Color color;

    private boolean siEscribe;
    private String nombre;

    
    public Boligrafo() {
    }


    public Boligrafo(Color color, boolean siEscribe, String nombre) {
        this.color = color;
        this.siEscribe = siEscribe;
        this.nombre = nombre;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public Color getColor() {
        return color;
    }


    public void setColor(Color color) {
        this.color = color;
    }


    public boolean isSiEscribe() {
        return siEscribe;
    }


    public void setSiEscribe(boolean siEscribe) {
        this.siEscribe = siEscribe;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}
