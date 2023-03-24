package com.example.demo.service;

import com.example.demo.model.Odontologo;
import com.example.demo.model.Paciente;
import com.example.demo.model.Turno;
import com.example.demo.repository.OdontologoRepository;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TurnoService {
    private TurnoRepository turnoRepository;
    private OdontologoRepository odontologoRepository;
    private PacienteRepository pacienteRepository;
    @Autowired
    public TurnoService(TurnoRepository turnoRepository, OdontologoRepository odontologoRepository, PacienteRepository pacienteRepository) {
        this.turnoRepository = turnoRepository;
        this.odontologoRepository = odontologoRepository;
        this.pacienteRepository = pacienteRepository;
    }

    public Turno generar(Integer dni, Integer matricula, String fechaTurno){
    if(dni<0 || matricula<0 || fechaTurno == null){
        throw  new RuntimeException("Valores nulos");
    }
    Optional<Odontologo> odontologo=  this.odontologoRepository.findById(matricula);
    Optional<Paciente> paciente=  this.pacienteRepository.findById(dni);

    if(odontologo.isPresent() && paciente.isPresent()){
        Turno turno = new Turno(odontologo.get(), paciente.get(), fechaTurno);
        this.turnoRepository.save(turno);
        return turno;
    }
    return new Turno();
    }

}
