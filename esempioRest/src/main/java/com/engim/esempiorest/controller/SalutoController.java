package com.engim.esempiorest.controller;

import com.engim.esempiorest.model.Nomi;
import com.engim.esempiorest.model.Saluto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SalutoController {

    /**
     * Metodo che riceve un nome in input da URL (oppure usa il default)
     * @param name
     * @return messaggio di saluto con nome ricevuto
     */
    @GetMapping("/saluto")
    public Saluto getSaluto(@RequestParam(value = "name", defaultValue = "Matteo") String name) {
        return new Saluto(0, "Ciao " + name + "!");

    }

    /**
     * Metodo che aggiunge un nome passato tramite URL alla variabile name
     * @param name
     * @return nome ricevuto e messaggio di conferma
     */
    @GetMapping("/add")
    public String addNome(@RequestParam(value = "name") String name) {
        Nomi.getNomi().add(name);
        return name + " è stato aggiunto.";

    }

    /**
     * Metodo che mostra tutti i nomi presenti nella lista
     * @return
     */
    @GetMapping("/show")
    public List<String> showNome() {
        return Nomi.getNomi();

    }

    /**
     * Metodo che riceve un nome tramite URL, controlla se esiste nella lista, poi lo rimuove
     * @param name
     * @return nome ricevuto e messaggio di conferma
     */
    @GetMapping("/delete")
    public String deleteNome(@RequestParam(value = "name") String name) {
        if(Nomi.getNomi().contains(name.toLowerCase())) {
            Nomi.getNomi().remove(name);

        } else {
            return name + " non esiste.";

        }

        return name + " è stato rimosso.";

    }


}
