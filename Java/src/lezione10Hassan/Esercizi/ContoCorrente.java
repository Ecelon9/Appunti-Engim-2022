package lezione10Hassan.Esercizi;

import java.util.Random;

public class ContoCorrente {

    private int saldo;
    private String coordinate = "IT ";
    private int pin;

    public ContoCorrente() {
        setCoordinate();
        setPin();

    }

    public ContoCorrente(int saldoIniziale) {
        this.saldo = saldoIniziale;
        setCoordinate();
        setPin();

    }

    @Override
    public String toString() {
        return "Dati ContoCorrente:\n" +
                "IBAN: " + this.coordinate + "\n" +
                "Saldo: " + this.saldo;

    }

    public int getSaldo() {
        return this.saldo;

    }

    public String getCoordinate() {
        return this.coordinate;

    }

    public void setCoordinate() {
        Random random = new Random();
        int x = random.nextInt(8999) + 1000;
        this.coordinate += x + " ";

        x = random.nextInt(8999) + 1000;
        this.coordinate += x + " ";

        x = random.nextInt(8999) + 1000;
        this.coordinate += x + " ";

        x = random.nextInt(8999) + 1000;
        this.coordinate += x;

    }

    public void setPin() {
        Random random = new Random();
        int x = random.nextInt(999) + 100;

        this.pin = x;

    }

    public void deposita(int richiesta) {
        if (richiesta > this.saldo || richiesta <= 0) {
            System.out.println("Errore");

        } else {
            this.saldo += richiesta;

        }


    }

    public void ritira(int richiesta) {
        if (richiesta > this.saldo || richiesta <= 0) {
            System.out.println("Errore");

        } else {
            this.saldo -= richiesta;

        }


        
    }











}
