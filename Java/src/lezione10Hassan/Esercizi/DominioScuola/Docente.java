package lezione10Hassan.Esercizi.DominioScuola;

public class Docente extends Persona {

    private String corso;

    public Docente() {
        super();

    }

    public Docente(String nome, String cognome, int eta, String corso) {
        super(nome, cognome, eta);
        this.corso = corso;

    }

    public String getCorso() {
        return this.corso;

    }

    public void setCorso(String corso) {
        this.corso = corso;

    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\n" +
                "Cognome: " + super.getCognome() + "\n" +
                "Età: " + super.getEta() + "\n" +
                "Docente di: " + this.corso;

    }

    
}
