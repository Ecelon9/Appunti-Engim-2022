package lezione12Hassan.poligoni;

import lezione12Hassan.interfacce.Triangolo;

public class TriangoloIsoscele extends Triangolo {

    private Integer valLatiUguali;
    private Integer valLato;

    public TriangoloIsoscele() {}

    public TriangoloIsoscele(int latiUguali, int lato) {
        this.valLatiUguali = latiUguali;
        this.valLato = lato;

    }

    @Override
    public double calcolaArea() {
        double h = calcolaMediana();

        return (valLato * h) / 2;

    }

    @Override
    public double calcolaMediana() {
        return Math.sqrt(Math.pow(valLatiUguali,2) - ((Math.pow(valLato,2)) /4));
    }

    @Override
    public double calcolaPerimetro() {
        return valLatiUguali * 2 + valLato;

    }

    
}
