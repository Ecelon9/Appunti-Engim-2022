package com.engim.lupusinjava.model;

public class Turno {
    public Turno() {
        this.fase = Fase.GIORNO;
        this.num = 1;
    }

    enum Fase{GIORNO,NOTTE}
    Fase fase;
    int num;

    @Override
    public String toString() {
        return fase + " " + num;
    }

    public void next() {
        if (fase == Fase.GIORNO)
            fase = Fase.NOTTE;
        else {
            fase = Fase.GIORNO;
            num++;
        }
    }
}