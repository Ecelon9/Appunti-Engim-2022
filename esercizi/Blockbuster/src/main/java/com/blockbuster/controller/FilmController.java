package com.blockbuster.controller;
import com.blockbuster.model.Film;
import com.blockbuster.repository.FilmRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/film")
public class FilmController {

    @GetMapping(value = "/selezionaFilm")
    public List<Film> selezionaFilm(){
        return FilmRepository.selezionaFilm();
    }

    @PostMapping(value = "/inserisciFilm")
    public String inserisciFilm(Film film){
        FilmRepository.inserisciFilm(film);
        return film.getNomeFilm() + " è stato aggiunto";
    }

    @PostMapping("/rimuoviFilm")
    public String rimuoviFilm(String nomeFilm){
        return FilmRepository.rimuoviFilm(nomeFilm);
    }


}
