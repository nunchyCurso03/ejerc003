package es.santander.ascender.ejerc003.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDENADOR")
public class Ordenador{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Color color;

    private boolean siIntel;
    private int teclas;
    private double peso;


    public Ordenador() {
    }

    public Ordenador(Color color, boolean siIntel, int teclas, double peso) {
        this.color = color;
        this.siIntel = siIntel;
        this.teclas = teclas;
        this.peso = peso;
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


    public boolean isSiIntel() {
        return siIntel;
    }


    public void setSiIntel(boolean siIntel) {
        this.siIntel = siIntel;
    }


    public int getTeclas() {
        return teclas;
    }


    public void setTeclas(int teclas) {
        this.teclas = teclas;
    }


    public double getPeso() {
        return peso;
    }


    public void setPeso(double peso) {
        this.peso = peso;
    }


    

    
    

    

}
