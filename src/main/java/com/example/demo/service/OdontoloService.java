package com.example.demo.service;

import com.example.demo.model.Odontologo;
import com.example.demo.repository.OdontologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OdontoloService {
    private OdontologoRepository odontologoRepository;
    @Autowired
    public OdontoloService(OdontologoRepository odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    public Odontologo crear(Odontologo odontologo){
      this.odontologoRepository.save(odontologo);
      return odontologo;
    }

    public List<Odontologo> obtenerTodosOdontologos(){
        Iterable<Odontologo> iterableOdontologo = odontologoRepository.findAll();
        List<Odontologo> odontologos  = new ArrayList<>();
        iterableOdontologo.forEach(odontologos::add);
        return odontologos;
    }

    public Odontologo eliminarOdontologo(Integer matricula){
        Optional<Odontologo> optOdontologo = odontologoRepository.findById(matricula);
        if(optOdontologo.isPresent()){
            this.odontologoRepository.deleteById(matricula);
        }else {
            throw new RuntimeException("El odontologo que desea eliminar no se encuentra");
        }
    return optOdontologo.get();
    }
}
