import java.util.Random;

public class Persona {
    private static String nome;
    private static String cognome;
    private int numeroConto;
    private int pin;

    public Persona (String nome, String cognome) {
        Persona.nome = nome;
        Persona.cognome = cognome;
        this.numeroConto = generaNumConto();
        this.pin = generaPin();

    }

    public String getNome() {
        return Persona.nome;
    }

    public String getCognome() {
        return Persona.cognome;
    }

    public int getConto() {
        return this.numeroConto;

    }

    public int getPin() {
        return this.pin;

    }

    public int generaNumConto() {
        return this.numeroConto = new Random().nextInt(500000) + 100000;

    }

    public int generaPin() {
        return this.pin = new Random().nextInt(999) + 100;

    }

}
