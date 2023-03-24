package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table(name = "turno")

public class Turno {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "matricula")
    private Odontologo odontologo;
    @OneToOne
    @JoinColumn(name = "dni")
    private Paciente paciente;
    @Column(name = "fecha")
    private String fecha;

    public Turno() {
    }

    public Turno( Odontologo odontologo, Paciente paciente, String fecha) {
        this.odontologo = odontologo;
        this.paciente = paciente;
        this.fecha = fecha;
    }

    public Integer getId() {
        return id;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getFecha() {
        return fecha;
    }
}
