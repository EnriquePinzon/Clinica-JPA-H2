package com.example.demo.model;

import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @Column(name = "dni")
    private Integer dni;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "domicilio")
    private String domicilio;

    public Paciente() {
    }

    public Paciente(Integer dni, String nombre, String apellido, String domicilio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
    }

    public Integer getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }
}
