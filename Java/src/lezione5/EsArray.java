import util.Util;
import java.util.Scanner;

public class EsArray {
    public static void main(String[] args) {
        int[] arrayNumeri1 = {5, 2, 4, 2, 1, 2};
        int[] arrayNumeri2 = {2, 1, 2, 9, 3, 5};

        System.out.println("Il numero minimo è: " + Util.numMinimo(arrayNumeri1));
        System.out.println("L'indice di numero minimo è: " + Util.indiceMinimo(arrayNumeri1));
        Util.sommaVettoriale(arrayNumeri1, arrayNumeri2);

        System.out.println();
        int[] a = Util.crea(3);

    }

}