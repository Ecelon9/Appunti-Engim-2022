package com.engim.biblioteca.controller;


import com.engim.biblioteca.model.Libro;
import com.engim.biblioteca.model.Prestito;
import com.engim.biblioteca.model.Utente;
import com.engim.biblioteca.repository.LibroRepository;
import com.engim.biblioteca.repository.PrestitoRepository;
import com.engim.biblioteca.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BibliotecaController {

    @Autowired
    LibroRepository libroRepository;

    @Autowired
    UtenteRepository utenteRepository;

    @Autowired
    PrestitoRepository prestitoRepository;

    @GetMapping("/addLibro")
    public String addLibro(@RequestParam(value = "titolo")
                           String titolo,
                           @RequestParam(value = "autore")
                           String autore){
        Libro l = new Libro(titolo,autore);
        libroRepository.save(l);
        return "OK";

    }

    @GetMapping("/addUtente")
    public String addUtente(@RequestParam(value = "nome")
                           String nome,
                           @RequestParam(value = "cognome")
                           String cognome){
        Utente l = new Utente(nome,cognome);
        utenteRepository.save(l);

        return "OK";

    }
    @GetMapping("/getLibri")
    public List<Libro> getLibri(){
        return libroRepository.findAll();
    }

    @GetMapping("/getLibroById")
    public Libro getLibroById(
            @RequestParam(value="id")
            int id){
        return libroRepository.findById(id);
    }

    @GetMapping("/addPrestito")
    public String addPrestito(@RequestParam(value = "idUtente")
                            int idUtente,
                            @RequestParam(value = "idLibro")
                            int idLibro){
        Utente u = utenteRepository.findById(idUtente);
        Libro l = libroRepository.findById(idLibro);
        Prestito p = new Prestito(u,l);
        prestitoRepository.save(p);

        return "OK";

    }



}
