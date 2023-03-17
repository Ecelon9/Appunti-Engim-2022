public class BottigliaConMateriale extends BottigliaConTappo{

    private Materiale m;

    public BottigliaConMateriale(int capacita, Materiale m){
        super(capacita);
        this.m = m;

    }

    public BottigliaConMateriale(int capacita, int quantita, Materiale m) {
        super(capacita, quantita);
        this.m = m;

    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.m;
    }
}
