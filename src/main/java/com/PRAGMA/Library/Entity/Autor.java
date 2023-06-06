package com.PRAGMA.Library.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="autores")

public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="nombres",length = 15)
    private String nombre;

    @Column(name="apellidos", length = 15)
    private String apellido;

    @Column(name="pseudonimos", unique = true,length = 20)
    private String pseudonimo;

    @Column(name="emails")
    private String email;
    //validar estructura de email

    @OneToOne(mappedBy = "autor")
    private List<Pais> pais;

    @Transient
    private String mensajeError;


    public Autor() {
    }

    public Autor(Integer id, String nombre, String apellido,
                 String pseudonimo, String email, List<Pais> pais) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.pseudonimo = pseudonimo;
        this.email = email;
        this.pais = pais;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPseudonimo() {
        return pseudonimo;
    }

    public void setPseudonimo(String pseudonimo) {
        this.pseudonimo = pseudonimo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Pais> getPais() {
        return pais;
    }

    public void setPais(List<Pais> pais) {
        this.pais = pais;
    }

    public String getMensajeError() {
        return mensajeError;
    }

    public void setMensajeError(String mensajeError) {
        this.mensajeError = mensajeError;
    }
}
