package com.engim.lupusinjava.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Partita {

    private List<Giocatore> giocatori;
    private Turno turno;
    private Map<Giocatore,Integer> voti;
    private Giocatore protetto;
    private Giocatore linciato;
    private Giocatore votoLupi;

    private Stato stato;
    enum Stato{CREATA,AVVIATA,TERMINATA}

    public Partita() {
        giocatori = new ArrayList<>();
        turno = new Turno();
    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    public Turno getTurno() {
        return turno;
    }

    public Map<Giocatore, Integer> getVoti() {
        return voti;
    }

    public Giocatore getProtetto() {
        return protetto;
    }

    public Giocatore getLinciato() {
        return linciato;
    }

    public Giocatore getVotoLupi() {
        return votoLupi;
    }

    public Stato getStato() {
        return stato;
    }

    public boolean aggiungiGiocatore(String nome){
        boolean esiste = false;
        for(Giocatore g : giocatori)
            esiste = esiste || g.getNome().equals(nome);
        if(!esiste && giocatori.size() < 13)
            giocatori.add(new Giocatore(nome));
        return esiste;
    }
}
