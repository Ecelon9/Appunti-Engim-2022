package lezione10Hassan.Esercizi.DominioScuola;

public class Persona {

    private String nome;
    private String cognome;
    private int eta;

    public Persona() {

    }

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    public String getNome() {
        return this.nome;

    }

    public String getCognome() {
        return this.cognome;

    }

    public int getEta() {
        return this.eta;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public void setCognome(String cognome) {
        this.cognome = cognome;

    }

    public void setEta(int eta) {
        this.eta = eta;

    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" +
                "Cognome: " + this.cognome + "\n" +
                "Età: " + this.eta;

    }

}
