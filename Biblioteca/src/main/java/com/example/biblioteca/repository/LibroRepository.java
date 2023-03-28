package com.engim.biblioteca.repository;

import com.engim.biblioteca.model.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, Integer> {

    Libro findById(int id);
    List<Libro> findByAutore(String autore);
    List<Libro> findAll();
}
