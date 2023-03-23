package lezione12Hassan.scuola;

import lezione12Hassan.scuola.src.Dipendente;

public class Docente extends Dipendente {

    private String materia;
    private Integer stipendio;

    public Docente() {}

    public Docente(String nome, String cognome, String materia, int stipendio) {
        super(nome, cognome);
        this.materia = materia;
        this.stipendio = stipendio;

    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getStipendio() {
        return stipendio;
    }

    public void setStipendio(Integer stipendio) {
        this.stipendio = stipendio;
    }

    @Override
    public String toString() {
        return "Docente: nome: " + super.getNome() +
                "\t cognome: " + super.getCognome() +
                "\t materia: " + materia + 
                "\t + stipendio: " + stipendio;
    }
    
}
