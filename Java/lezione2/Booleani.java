import java.util.Scanner;

public class Booleani {

    public static void main(String[] args) {

        /*
         * not !
         * and &&
         * or ||
         * 
         */

        // Inserire un numero da tastiera e stampare la valutazione se è pari o dispari

        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci un numero: ");

        int numero = Integer.parseInt(input.nextLine());

        System.out.println("E' un numero pari? " + (numero % 2 == 0));

        System.out.println("E' un numero positivo? " + (numero > 0));

        System.out.println("E' compreso fra 0 e 10? " + (numero <= 10 && numero >= 0));

        System.out.println("E' pari o minore di 5? " + (numero % 2 == 0 || numero < 5));

        System.out.println("E' maggiore di 1000 e finisce per 3? " + (numero > 1000 && (numero % 10 == 3)));

        System.out.println("E' bisestile? " + (numero % 4 == 0 && !(numero % 100 == 0) || numero % 400 == 0));







        input.close();

    }

}
