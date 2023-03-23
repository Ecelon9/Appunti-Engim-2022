package lezione12Hassan.poligoni;

import lezione12Hassan.interfacce.Triangolo;

public class TriangoloScaleno extends Triangolo{

    private Integer lato1;
    private Integer lato2;
    private Integer lato3;
    private Integer altezza;

    public TriangoloScaleno() {}

    public TriangoloScaleno(int lato1, int lato2, int lato3, int altezza) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.altezza = altezza;

    }

    @Override
    public double calcolaArea() {
        return lato1 * altezza / 2;
    }

    @Override
    public double calcolaMediana() {
        return 0.5 * Math.sqrt(2 * (Math.pow((lato1 + lato2),2)) + ((Math.pow((lato1 + lato3),2)) - (Math.pow((lato2 + lato3), 2))));

    }

    @Override
    public double calcolaPerimetro() {
        return lato1 + lato2 + lato3;

    }
    
}
