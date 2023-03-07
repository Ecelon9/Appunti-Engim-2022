package util;
import java.util.Scanner;
public class Util {

    public static void riempi(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Riempi un array: inserisci un numero: ");
            array[i] = Integer.parseInt(input.nextLine());

        }
        input.close();

    }

    public static int[] crea(int n) {
        int[] array = new int[n];
        riempi(array);
        stampa(array);
        return array;

    }

    //creare il metodo stampa.

    public static void stampa(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Posizione " + i + " = " + array[i]);
        }
    }

    public static int numMinimo(int[] array) {
        int valMinimo = 10;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valMinimo) {
                valMinimo = array[i];
            }
        }
        return valMinimo;

    }

    public static int indiceMinimo(int[] array) {
        int valMinimo = 10;
        int indiceArray = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < valMinimo) {
                indiceArray = i;
            }
        }
        return indiceArray;

    }

    public static void sommaVettoriale(int[]array1, int[]array2) {
        int[] sommaArray = new int [array1.length];

        for (int i = 0; i < array1.length; i++) {
            sommaArray[i] = array1[i]+array2[i];

        }
        mostraSomma(sommaArray);
    }

    public static void mostraSomma(int[]array) {
        System.out.println("La somma dei due array è:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }




}
