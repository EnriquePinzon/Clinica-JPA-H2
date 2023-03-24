package com.example.demo.repository;

import com.example.demo.model.Odontologo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends CrudRepository<Odontologo, Integer> {


}
