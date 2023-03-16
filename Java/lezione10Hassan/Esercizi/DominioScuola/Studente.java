package lezione10Hassan.Esercizi.DominioScuola;

public class Studente extends Persona {

    private String matricola;
    private String materiaPreferita;

    public Studente() {
        super();

    }

    public Studente(String nome, String cognome, int eta, String matricola, String materiaPreferita) {
        super(nome, cognome, eta);
        this.matricola = matricola;
        this.materiaPreferita = materiaPreferita;

    }

    public String getMatricola() {
        return this.matricola;

    }

    public String getMateriaPref() {
        return this.materiaPreferita;

    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;

    }

    public void setMateriaPref(String materia) {
        this.materiaPreferita = materia;

    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\n" +
                "Cognome: " + super.getCognome() + "\n" +
                "Età: " + super.getEta() + "\n" +
                "Numero matricola: " + this.matricola + "\n" +
                "Materia Preferita: " + this.materiaPreferita;

    }

}
