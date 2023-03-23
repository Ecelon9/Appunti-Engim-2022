package lezione12Hassan.poligoni;

import lezione12Hassan.interfacce.MisurePoligono;

public class Quadrato implements MisurePoligono {

    //Attributi
    public static final Integer nLati = 4;
    private Double valoreLato;

    //Costruttori
    public Quadrato() {}

    public Quadrato(Double valoreLato) {
        this.valoreLato = valoreLato;
    }

    //Getter e setter
    public Double getValoreLato() {
        return valoreLato;
    }

    public void setValoreLato(Double valoreLato) {
        this.valoreLato = valoreLato;
    }

    //Override dell'interfaccia
    @Override
    public double calcolaArea() {
        return Math.pow(this.valoreLato,2);
    }

    @Override
    public double calcolaMediana() {
        return Math.sqrt(Math.pow(valoreLato, 2));


    }

    @Override
    public double calcolaPerimetro() {
        return this.valoreLato * nLati;
    }
}
