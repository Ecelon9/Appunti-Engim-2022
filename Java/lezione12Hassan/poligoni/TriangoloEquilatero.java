package lezione12Hassan.poligoni;

import lezione12Hassan.interfacce.Triangolo;

public class TriangoloEquilatero extends Triangolo{

    private Integer valCateto;

    public TriangoloEquilatero(int valCateto) {
        this.valCateto = valCateto;
    }

    @Override
    public double calcolaArea() {
        return (Math.pow(valCateto, 2) * Math.sqrt(3)) / 4;

    }

    @Override
    public double calcolaMediana() {
        return (valCateto * Math.sqrt(3)) / 2;
    }

    @Override
    public double calcolaPerimetro() {
        return this.valCateto * getLati();
    }
    
}
