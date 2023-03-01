package util;

import java.util.Scanner;

public class Util {

    public static void riempi(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserisci un numero: ");
            array[i] = Integer.parseInt(input.nextLine());

        }
    }

    public static int[] crea(int n) {
        int[] array = new int[n];
        riempi(array);
        return array;
    }

    //creare il metodo stampa.

    public static void stampa(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Posizione " + i + " = " + array[i]);
        }
    }

    public static int minimoVal(int[] array) {

        int minimo = 10;

        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimo) {
                minimo = array[i];

            }
        }

        System.out.println("Il valore più piccolo è: " + minimo);
        return minimo;
    }






}
