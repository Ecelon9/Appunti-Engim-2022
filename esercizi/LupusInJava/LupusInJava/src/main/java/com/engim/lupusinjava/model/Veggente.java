package com.engim.lupusinjava.model;

public class Veggente extends Personaggio {

    public Veggente() {
        super("Veggente", Fazione.BUONO);

    }

    @Override
    public void potereNotturno() {
        if(ruoloGiocatore == "lupo".toLowerCase()) {
            return true;
        }
        return false;

    }
}
