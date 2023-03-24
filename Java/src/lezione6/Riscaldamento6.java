import java.util.Arrays;
import util.Util;

public class Riscaldamento6 {
    public static void main(String[] args) {

        //Esercizio 1:
        stampaArgs(args);

        //Esercizio 2:
        stampaLettere("Coccodrillo", "cocomero");

        int[] arrayNumeri1 = {0, 9, 1};
        int[] arrayNumeri2 = {0, 8, 1};
        int[] arrayNumeri3 = {0, 8, 1};
        System.out.println(confrontaArray(arrayNumeri2, arrayNumeri3));

        //Esercizio 3:
        int[] array = Util.crea(10);
        arrayPositivo(array);


    }

    //Stampa i numeri inseriti nel config nel terminale
    public static void stampaArgs(String[] args) {
        System.out.print("Numeri args: ");

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }

        sommaArgs(args);
    }

    //Viene richiamato da stampaArgs e effettua la somma
    public static void sommaArgs(String[] args) {
        int totale = 0;
        System.out.println();

        for (int i = 0; i < args.length; i++) {
            totale += Integer.parseInt(args[i]);
        }
        System.out.println("La somma è: " + totale);
    }

    //Stampa lettere in comune fra due stringhe
    public static void stampaLettere(String parola1, String parola2) {
        String lettereInComune = "";
        //System.out.println(parola1 + " " + parola2);

        for (int i = 0; i < parola1.length(); i++) {
            for (int j = 0; j < parola2.length(); j++) {
                if (parola1.toLowerCase().charAt(i) == parola2.toLowerCase().charAt(j)
                        && !lettereInComune.equalsIgnoreCase(parola2)) {        //non riesco a gestire l'AND
                    lettereInComune += parola1.charAt(i);

                }
            }
        }

        /*for (int i = 0; i < parola1.length(); i++) {
            if(parola1.equalsIgnoreCase(parola2)){          //non entra nell'if

                lettereInComune += parola1.charAt(i);

            }
        }*/

        System.out.println("lettere in comune: " + lettereInComune);
    }

    //Confronta due array
    public static boolean confrontaArray(int[]array1, int[]array2) {
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] != array2[i]) { //Non sono convinto di questo pezzo
                return false;

            }
        }
        return true;

        /*
        if (!Arrays.equals(array1, array2)) {   //Ho trovato questa soluzione
            return false;
        }
        return true;
        */
    }

    //Crea un array con numeri maggiori o pari a 0;
    public static void arrayPositivo(int[]array) {
        int numPositivo = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0) {
                numPositivo++;
            }
        }
        System.out.println("Lunghezza array " + numPositivo);

        int[] arrayMag = new int[numPositivo];
        for (int i = 0; i < array.length; i++) {
            if(array[i] >= 0) {
                arrayMag[i] = array[i];     //OutOfBound...
            }
        }

        Util.stampa(arrayMag);

    }




}
