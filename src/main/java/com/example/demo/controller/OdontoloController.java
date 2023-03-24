package com.example.demo.controller;

import com.example.demo.model.Odontologo;
import com.example.demo.service.OdontoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class OdontoloController {

    private OdontoloService odontoloService;
    @Autowired
    public OdontoloController(OdontoloService odontoloService) {
        this.odontoloService = odontoloService;
    }

    @PostMapping("/odontologo")
    public Odontologo crear(@RequestBody Odontologo odontologo){
        return this.odontoloService.crear(odontologo);
    }

    //crear endpoint para obtener todos los odontologos

    @GetMapping("/odontologo")
    public List<Odontologo> obtenerTodosOdontologos(){
    return odontoloService.obtenerTodosOdontologos();

    }

    //crear endpoint para eliminar odontologo por matricula

    @DeleteMapping("/odontologo/{matricula}")
    public Odontologo eliminarOdontologo(@PathVariable("matricula") Integer matricula){
        return odontoloService.eliminarOdontologo(matricula);
    }

}
