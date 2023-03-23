package lezione10Hassan.Esercizi;

public class Studente extends Persona{

    private String corso;

    public Studente() {

    }

    public Studente(String nome, String cognome, int eta, String corso) {
        super(nome, cognome, eta);
        this.corso = corso;

    }

    public String getCorso() {
        return this.corso;

    }

    public void setContratto(String corso) {
        this.corso = corso;
        
    }    

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\n" +
                "Cognome: " + super.getCognome() + "\n" +
                "Età: " + super.getEta() + "\n" +
                "Corso seguito: " + this.corso;
    }

}