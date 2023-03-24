package com.example.demo.controller;

import com.example.demo.model.Odontologo;
import com.example.demo.model.Paciente;
import com.example.demo.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")

public class PacienteController {
    private PacienteService pacienteService;
    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.pacienteService = pacienteService;
    }

    @PostMapping("/paciente")
    public Paciente crear(@RequestBody Paciente paciente){
        return this.pacienteService.crear(paciente);
    }


    //crear endpoint para obtener todos los pacientes

    @GetMapping("/paciente")
    public List<Paciente> obtenerTodosPacientes(){
        return pacienteService.obtenerTodosPacientes();

    }

    //crear endpoint para eliminar paciente por dni
    @DeleteMapping("/paciente/{dni}")
    public Paciente eliminarPaciente(@PathVariable("dni") Integer dni){
        return pacienteService.eliminarPaciente(dni);
    }

}

