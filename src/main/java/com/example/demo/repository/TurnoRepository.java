package com.example.demo.repository;

import com.example.demo.model.Turno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends CrudRepository<Turno, Integer> {
}
