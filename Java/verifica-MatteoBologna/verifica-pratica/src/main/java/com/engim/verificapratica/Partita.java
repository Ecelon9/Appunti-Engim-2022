package com.engim.verificapratica;

import java.util.List;

public class Partita {

    private Squadra squadra1;
    private Squadra squadra2;

    public Partita(List<Squadra> squadreSorteggiate) {
        this.squadra1 = squadreSorteggiate.get(0);
        this.squadra2 = squadreSorteggiate.get(1);
    }

    public Squadra getSquadra1() {
        return squadra1;
    }

    public void setSquadra1(Squadra squadra1) {
        this.squadra1 = squadra1;
    }

    public Squadra getSquadra2() {
        return squadra2;
    }

    public void setSquadra2(Squadra squadra2) {
        this.squadra2 = squadra2;
    }
}
