import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ContoCorrente mioConto = new ContoCorrente(new Persona ("Matteo", "Bologna"), 2000);

        System.out.println("Benvenuto nel tuo conto: scegli un opzione.");
        System.out.println("Deposita    -    Preleva   -   Mostra Dati   -   Uscire");
        String opzione = input.nextLine();

        /*
        * implementare il controllo dell'ortografia e login        *
        * */

        while(!opzione.equals("uscire")) {
            if (opzione.equals("deposita")) {
                System.out.println("Quanto vuoi depositare?");
                int deposito = Integer.parseInt(input.nextLine());
                mioConto.deposita(deposito);
                System.out.println("Il suo saldo è: " + mioConto.getSaldo());
                mioConto.mostraOpzioni();
                opzione = input.nextLine();

            } else if (opzione.equals("preleva")) {
                System.out.println("Quanto vuoi prelevare?");
                int prelievo = Integer.parseInt(input.nextLine());
                mioConto.preleva(prelievo);
                System.out.println("Il suo saldo è: " + mioConto.getSaldo());
                mioConto.mostraOpzioni();
                opzione = input.nextLine();

            } else if (opzione.equals("mostra dati")) {
                mioConto.getDati();
                mioConto.mostraOpzioni();
                opzione = input.nextLine();

            }
        }

        System.out.println("Grazie e arrivederci.");
        input.close();

    }
}