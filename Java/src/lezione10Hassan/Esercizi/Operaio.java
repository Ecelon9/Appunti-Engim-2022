package lezione10Hassan.Esercizi;

public class Operaio extends Persona {

    private int stipendio;
    private String contratto;

    public Operaio() {

    }

    public Operaio(String nome, String cognome, int eta, int stipendio, String contratto) {
        super(nome, cognome, eta);
        this.stipendio = stipendio;
        this.contratto = contratto;

    }

    public int getStipendio() {
        return this.stipendio;

    }

    public String getContratto() {
        return this.contratto;
        
    }

    public void setStipendio(int stipendio) {
        this.stipendio = stipendio;

    }

    public void setContratto(String contratto) {
        this.contratto = contratto;
        
    }    

    @Override
    public String toString() {
        return "Nome: " + super.getNome() + "\n" +
                "Cognome: " + super.getCognome() + "\n" +
                "Età: " + super.getEta() + "\n" +
                "Tipo di contratto: " + this.contratto + "\n" +
                "Stipendio: " + this.stipendio;
    }



}