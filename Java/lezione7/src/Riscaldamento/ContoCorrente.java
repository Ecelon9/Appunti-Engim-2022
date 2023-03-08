public class ContoCorrente {

    Persona persona;
    private int saldo;
    private int numeroConto;
    private int pin;


    public ContoCorrente(Persona p, int saldo) {
        this.persona = p;
        this.saldo = saldo;
        this.numeroConto = persona.getConto();
        this.pin = persona.getPin();

    }

    public void preleva(int prelievo) {
        if (prelievo < 0 || prelievo > saldo) {
            System.out.println("Errore.");

        } else {
            this.saldo -= prelievo;

        }
    }

    public void deposita(int deposito) {
        if (deposito < 0) {
            System.out.println("Errore.");

        } else {
            this.saldo += deposito;

        }
    }

    public void getDati() {
        System.out.println("Nome: " + persona.getNome());
        System.out.println("Cognome: " + persona.getCognome());
        System.out.println("Numero del conto: " + numeroConto);
        System.out.println("Saldo: " + saldo);

    }

    public int getSaldo() {
        return saldo;

    }

    public void mostraOpzioni() {
        System.out.println("Scegli un opzione.");
        System.out.println("Deposita    -    Preleva   -   Mostra Dati   -   Uscire");

    }


}
