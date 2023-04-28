package com.engim.verificapratica;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {

    private static Sorteggio sorteggio = new Sorteggio();

    @GetMapping(value = "/aggiungiSquadra")
    public String aggiungiSquadra(@RequestParam(value = "nome") String nome, @RequestParam(value = "nazione") String nazione) {
        sorteggio.aggiungi(nome, nazione);
        return nome + " è stato aggiunto al sorteggio!";
    }

    @GetMapping(value = "listaSquadre")
    public List<Squadra> mostraSquadrePerNazione(@RequestParam(value = "nazione") String nazione) {
        List<Squadra> lista = new ArrayList<>();

        for (Squadra squadra : sorteggio.getSquadre()) {
            if (squadra.getNazione().equals(nazione)) {
                lista.add(squadra);

            }
        }
        return lista;

    }

    @GetMapping(value = "/sorteggia")
    public List<Squadra> sorteggiaSquadre() {
        List<Squadra> squadreSorteggiate = new ArrayList<>();
        Squadra sq1 = sorteggio.next();
        String nazioneSq1 = sq1.getNazione();
        squadreSorteggiate.add(sq1);

        while (squadreSorteggiate.size() < 2) {
            Squadra sq2 = sorteggio.next();
            String nazioneSq2 = sq2.getNazione();

            if (!nazioneSq2.equals(nazioneSq1)) {
                squadreSorteggiate.add(sq2);

            }
        }
        return squadreSorteggiate;

    }





}

    /*
    * ES 1: get ("/add?nome=n&nazione=m") che aggiunge al sorteggio una squadra con nome n e nazione m (utilizzare
    * la classe Sorteggio) - 15 p
    *
    * ES 2: get ("/listaSquadre?nazione=n") che restituisce la lista delle squadre di nazione n - 20 p
    *
    * ES 3: get ("/sorteggia") che restituisce 2 squadre di nazioni diverse (utilizzare la classe Sorteggio, il metodo
    * next. Consiglio: dopo aver sorteggiato la prima, continuare a sorteggiare finché la seconda
    * non è di una nazione diversa) - 20 p
    *
    * ES 4: implementare il sorteggio delle squadre di una fase finale di un torneo a eliminazione diretta.
    * Creare il metodo sorteggiaPartite che:
    * - controlla se il numero di squadre aggiunte è una potenza di 2. Se non lo è lancia una RuntimeException.
    * - Finché ci sono squadre non sorteggiate: sorteggia 2 squadre e le inserisce in un oggetto della classe Partita (da creare)
    * - restituisce la lista di Partite.
    * creare get ("/getPartite") che restituisce la lista appena creata - 30 p
    * */


