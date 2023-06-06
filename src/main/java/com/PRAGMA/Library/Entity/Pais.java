package com.PRAGMA.Library.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="paises")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;
    @Column(name="nombres",length = 15)
    private String nombre;

    @ManyToOne
    @JoinColumn(name="id_autor")
    private Autor autor;

    public Pais() {
    }

    public Pais(Integer id, String nombre, Autor autor) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
