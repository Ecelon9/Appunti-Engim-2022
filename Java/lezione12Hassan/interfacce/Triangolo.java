package lezione12Hassan.interfacce;

public abstract class Triangolo implements MisurePoligono {

    private final Integer nLati = 3;

    public int getLati() {
        return nLati;
    }

    @Override
    public abstract double calcolaArea();

    @Override
    public abstract double calcolaMediana();

    @Override
    public abstract double calcolaPerimetro();
    
}
