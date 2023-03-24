package com.example.demo.repository;

import com.example.demo.model.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PacienteRepository  extends CrudRepository<Paciente, Integer> {


}
