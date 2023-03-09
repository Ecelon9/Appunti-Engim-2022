package funzioni;
/*
 * In questa lezione illustreremo il funzionamento delle funzioni
 * vedendo la dichiarazione (firma/signature), assieme alla lista di parametri
 * passabili al loro interno 
 */

public class EsempioFn {

    /**
     * Restituisce la somma di due valori interi
     * @param num1
     * @param num2
     * @return risultato
     */
    public static int somma(int num1, int num2){
        int risultato = num1 + num2;

        return risultato;
    }

    public static void main(String[] args) {
    
        int num1 = 6;
        int num2 = 10;

        int risultato = somma(num1, num2);
        System.out.println("La somma è: " + risultato);


    } //end main

} // end class