package com.engim.lupusinjava.controller;

import com.engim.lupusinjava.model.Partita;
import com.engim.lupusinjava.model.persistence.Persistenza;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartiteController {

    @GetMapping("/creaPartita")
    public int creaPartita(){

        Partita p = new Partita();
        Persistenza.getPartite().add(p);
        return Persistenza.getPartite().indexOf(p);
    }

    @GetMapping("/aggiungiGiocatore")
    public boolean aggiungiGiocatore(@RequestParam(value = "id") int idPartita,
                                 @RequestParam(value="nome") String nome){

        Partita p = Persistenza.getPartite().get(idPartita);
        return ! p.aggiungiGiocatore(nome);
        // ritorna true se è andata a buon fine
    }

    @GetMapping("/startPartita")
    public boolean aggiungiGiocatore(@RequestParam(value = "id") int idPartita){

        Partita p = Persistenza.getPartite().get(idPartita);
        if(p.getGiocatori().size()<8)
            return false;
        // mancano i giocatori
        else{
            return true;
        }
    }


}
