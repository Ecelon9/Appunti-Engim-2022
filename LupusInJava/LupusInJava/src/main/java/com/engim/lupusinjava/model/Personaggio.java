package com.engim.lupusinjava.model;

public abstract class Personaggio {
    private String ruolo;
    private boolean vivo;
    private boolean votato;
    private boolean potereUsato;

    public Personaggio(String ruolo, Fazione fazione) {
        this.ruolo = ruolo;
        this.vivo = true;
        this.votato = false;
        this.potereUsato = false;
        this.fazione = fazione;
    }

    private Fazione fazione;

    enum Fazione{BUONO,CATTIVO}

    public abstract void potereNotturno();

}
