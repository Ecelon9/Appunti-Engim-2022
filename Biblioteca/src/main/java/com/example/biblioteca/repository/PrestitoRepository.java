package com.engim.biblioteca.repository;

import com.engim.biblioteca.model.Prestito;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrestitoRepository extends CrudRepository<Prestito, Integer> {

    Prestito findById(int id);
    List<Prestito> findAll();
}
