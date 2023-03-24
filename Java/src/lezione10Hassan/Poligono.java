package lezione12Hassan.interfacce;
/**
 * Astrazione
 */
public abstract class Poligono {

    /*
     * L'astrazione serve per stabilire in anticipo, Cosa voglio che il programma 
     * faccia, ma non il come.
     */   

    /*
    * una classe può essere astratta e può avere i suoi costruttore e metodi
    * ma non può essere istanziata (se non tramite override)
    */ 

    private int nLati;

    /*
     * public Poligono(){}
     * getter...
     * setter...
     */

     public abstract int calcolaArea(); // un metodo per calcolare l'area...

     /*
      * in questa fase, i metodi NON hanno corpo, perchè stiamo creando
      * una sorta di "modello" che ogni classe che lo implementa, deve seguire,
      * perchè dovrà implementare (con override) tutti i medoti astratti che possiede
      */
    
}
