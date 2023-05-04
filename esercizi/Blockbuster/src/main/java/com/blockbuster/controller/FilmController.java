package com.blockbuster.controller;
import com.blockbuster.model.Film;
import com.blockbuster.repository.FilmRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/film")
public class FilmController {

    @GetMapping(value = "/selezionaFilm")
    public List<Film> selezionaFilm(){
        return FilmRepository.selezionaFilm();
    }

    @PostMapping(value = "/inserisciFilm")
    public String inserisciFilm(@RequestBody Film film){
        FilmRepository.inserisciFilm(film);
        return film.getNomeFilm() + " è stato aggiunto!";
    }

    @PostMapping("/rimuoviFilm")
    public void rimuoviFilm(@RequestParam (value = "nome") String nomeFilm){
        FilmRepository.rimuoviFilm(nomeFilm);
    }


}
