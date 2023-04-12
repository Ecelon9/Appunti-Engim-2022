
/**
 * Creare uno studente con alcuni attributi di base (nome,cognome,età) che contegna una list adi voti
 * di una materia a caso e calcolare la media
 * gestire i casi
 * in cui la media sia insufficiente
 * i voti non siano presenti
 */

import java.util.*;
import mieEccezioni.*;

public class Studente {

    private String nome;
    private String cognome;
    private Integer eta;
    private HashMap<String, List<Double>> votiMateria = new HashMap<>();

    public Studente() {
    }

    public Studente(String nome, String cognome, Integer eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }

    public HashMap<String, List<Double>> getVotiMateria() {
        return this.votiMateria;
    }

    public void setVotiMateria(HashMap<String, List<Double>> votiMateria) {
        this.votiMateria = votiMateria;
    }

    public Double calcolaMediaVotiPerMateria(String materia) {

        try {
            Double somma = 0.0;

            if(this.votiMateria == null) {
                throw new NullPointerException("Array è null");

            } 

            if (this.votiMateria.isEmpty()) {
                
                throw new EmptyListException("Non posso calcolare la media se non ci sono voti");

            }
            for (Double voto : this.votiMateria.get(materia)) {
                somma += voto;

            }
            Double media = somma / (double) votiMateria.size();

            if (media < 6.0) {
                throw new InsufficientAverageException("Media insufficiente, CAPRA!");

            }
            return media;

        } catch (EmptyListException ex) {
           System.out.println(ex.getMessage());

        } catch (InsufficientAverageException ex) {
            System.out.println(ex.getMessage());
            
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());

        }
 
        return Double.NEGATIVE_INFINITY;

    }
}
