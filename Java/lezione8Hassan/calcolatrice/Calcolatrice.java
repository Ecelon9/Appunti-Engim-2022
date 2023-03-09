package calcolatrice;

import java.util.Scanner;

/*
 * @author Matteo
 * Creo una semplice calcolatrice che chiede due numeri in input e l'operazione
 * per poi eseguire il calcolo
 */

public class Calcolatrice {

    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    double risultato;
    String operatore;
    String[] opAmmissibili = { "+", "-", "*", "/" };
    boolean checkOperatore = false;

    /**
     * In costruzione chiedo due numeri all'utente
     * 
     * @param num1
     * @param num2
     */
    public Calcolatrice() {
        System.out.println("Inserisci un numero:");
        this.num1 = input.nextInt();

        System.out.println("Inserisci il secondo numero:");
        this.num2 = input.nextInt();
        setOperatore();

    }

    /**
     * Chiedo l'operazione all'utente tramite msg in terminale:
     * controllo che sia un carattere valido switchando un boolean,
     * ed eseguo l'operazione.
     */
    public void setOperatore() {
        System.out.println("Quale operazione vuoi fare?");
        System.out.println("Inserisci uno fra: +   -   *   /");

        this.operatore = input.next();

        for (int i = 0; i < opAmmissibili.length; i++) {
            if (this.operatore.contains(opAmmissibili[i])) {
                this.checkOperatore = true;

            }
        }

        if (this.checkOperatore) {
            setRisultato();

        } else {
            System.out.println("Hai inserito: " + this.operatore);
            System.out.println("Errore. Inserisci uno dei caratteri mostrati..");

        }
    }

    /*
     * In base all'operatore, verifico che le condizioni siano ottimali,
     * eseguo il calcolo e ad ogni case, mostro il risultato;
     */
    public void setRisultato() {

        switch (operatore) {
            case "+":
                this.risultato = this.num1 + this.num2;
                mostraRisultato();
                // continua();

                break;

            case "-":
                if (this.num1 > this.num2) {
                    this.risultato = this.num1 - this.num2;
                    mostraRisultato();
                    // continua();

                } else {
                    System.out.println(this.num1 + " è più piccolo di " + this.num2);
                    // continua();

                }
                break;

            case "*":
                if (this.num1 > 0 && this.num2 > 0) {
                    this.risultato = this.num1 * this.num2;
                    mostraRisultato();
                    // continua();

                } else {
                    this.risultato = 0;
                    mostraRisultato();
                    // continua();

                }
                break;

            case "/":
                if (this.num2 > 0) {
                    this.risultato = this.num1 / this.num2;
                    mostraRisultato();
                    // continua();

                } else {
                    System.out.println("Non puoi dividere per 0");
                    // continua();

                }

                break;

            default:
                break;
        }
    }

    /*
     * Mostro il risultato
     */
    public void mostraRisultato() {
        System.out.println("Il risultato è: " + this.risultato);

    }

    /*
     * public void continua() {
     * System.out.println("Vuoi eseguire un'altro calcolo? y  n");
     * String scelta = input.next();
     * 
     * if(scelta == "y") {
     * new Calcolatrice();
     * 
     * } else {
     * System.out.println("Chiudo");
     * 
     * }
     * }
     */
}
