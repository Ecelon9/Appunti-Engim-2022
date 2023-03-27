package classes;

import java.lang.reflect.Array;

/**
 * @author Matteo
 * Classe per i giocatori, con costruttore per nuovi giocatori senza punteggio
 * e costruttore per giocatori già presenti nel db a cui viene passato anche il
 * punteggio accumulato nelle partite.
 */

public class Player {

    private String userName;
    private int shotsFired;
    private int actualScore;
    private int personalScore;
    private static Object[] table;

    /**
     * Costruttore per nuovo giocatore, senza punteggio registrato nel db
     * @param name
     */
    public Player(String userName) {
        this.userName = userName;
        this.personalScore = 0;
        this.shotsFired = 0;
        this.actualScore = 0;
        initTable();

    }

    /**
     * Costruttore con parametro nome giocatore e punteggio preso da db
     * @param name
     * @param personalScore
     */
    public Player(String name, int personalScore) {
        this.userName = name;
        this.personalScore = personalScore;
        this.shotsFired = 0;
        this.actualScore = 0;
        initTable();

    }

    public String getUserName() {
        return userName;
    }
    
    public int getPersonalScore() {
        return personalScore;
    }

    public int getShotsFired() {
        return shotsFired;
    }

    public int getActualScore() {
        return actualScore;
    }

    /*
     * metodo da richiamare quando si deve sommare un punto
     */
    public void updateActual() {
        this.actualScore++;
    }
    
    /*
     * metodo da richiamare al log out che somma il punteggio
     * della partita a quello ricevuto dal db, da poi inviare al db
     */
    public void updatePersonalScore() {
        this.personalScore += actualScore;
    }

    /**
     * Inizializza tabella
     */
    public void initTable() {
        Player.table = new Array[11][11];
    }

    //... metodo che restituisce la tabella da usare per piazzare le navi

    @Override
    public String toString() {
        return "Player: user name= " + this.userName + ", \t Shots fired= " + this.shotsFired + ",\t Actual score= " + this.actualScore
                + ", \t Total score=" + personalScore;
    }
}