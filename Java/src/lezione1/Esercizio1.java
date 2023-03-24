package lezione1;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        /*
         * Scrivere un programma che chieda il nome e l'età
         * e stampi nel terminale
         * chieda l'età solo se il nome termina con "o"
         */

         String nome;
         int anni;

         Scanner input = new Scanner(System.in);

         System.out.println("Come ti chiami?");

         nome = input.nextLine();

         System.out.println("Il tuo nome è: " + nome);

        if (nome.endsWith("o")) {
            System.out.println("Quanti anni hai?");
            anni = Integer.parseInt(input.nextLine());

            System.out.println("Hai " + anni + " anni.");

        }

         input.close();

    }
}