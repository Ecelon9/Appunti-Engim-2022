package lezione12Hassan.poligoni;

import lezione12Hassan.interfacce.MisurePoligono;

public class Rettangolo implements MisurePoligono {

    private Integer valLatiLunghi;
    private Integer valLatiCorti;

    public Rettangolo() {}

    public Rettangolo(int valLatiLunghi, int valLatiCorti) {
        this.valLatiLunghi = valLatiLunghi;
        this.valLatiCorti = valLatiCorti;

    }

    @Override
    public double calcolaArea() {
        return valLatiCorti * valLatiLunghi;

    }

    @Override
    public double calcolaMediana() {
        return Math.sqrt(Math.pow(valLatiCorti, 2) + (Math.pow(valLatiLunghi, 2)));

    }

    @Override
    public double calcolaPerimetro() {
        return valLatiLunghi * 2 + valLatiCorti * 2;

    }
}
