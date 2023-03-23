package lezione1;


import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        /*
         * chiedere base e altezza di un rettangolo e restituire il perimetro.
         * 
         * chiedere il numero dei lati del poligono, farli inserire e restituire il
         * perimetro.
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Costruiamo un rettangolo: inserisci la lunghezza della base");

        int base = Integer.parseInt(input.nextLine());

        System.out.println("Adesso inserisci l'altezza");

        int altezza = Integer.parseInt(input.nextLine());

        System.out.println("Il perimetro è di: " + ((base * 2) + (altezza*2)) + " cm.");

        double diagonale = Math.sqrt((Math. pow(base,2) + Math. pow(altezza, 2)) );

        System.out.println("E la sua diagonale è : " + diagonale + "cm.");

        double diagAppros = Math.round(diagonale);

        System.out.println("... diagonale con round: " + diagAppros);

        diagAppros = Math.round(diagonale*100) /100.0;

        System.out.println(diagAppros);



        input.close();

    }

}
