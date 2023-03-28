package com.engim.biblioteca.repository;

import com.engim.biblioteca.model.Utente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UtenteRepository extends CrudRepository<Utente, Integer> {

    Utente findById(int id);
    List<Utente> findAll();
}
