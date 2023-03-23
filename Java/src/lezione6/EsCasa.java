import java.util.Scanner;

public class EsCasa {
    public static void main(String[] args) {

        //Esercizio 1:
        //disinnescaLaBomba();

        //Esercizio 2:
        //System.out.println(ordine());

        //Esercizio 3:
        /*
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Array inserito:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println();
        inverti(array);
        System.out.println();

        String parola = "a b c d e";
        System.out.println("Parola inserita: " + parola);
        System.out.println(tuttoAttaccato(parola));
        */
        // Esercizio p260

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire il voto dell'esame 1:");

        int punteggiolniziale = Integer.parseInt(tastiera.nextLine());
        int[] punteggioSeguente = new int[3];

        for (int i = 0; i < punteggioSeguente.length; i++) {
            punteggioSeguente[i] = punteggiolniziale + 5 * i;
        }

        double[] punteggioMedio = ottieniArrayDiMedie(punteggiolniziale, punteggioSeguente);

        for (int i = 0; i < punteggioSeguente.length; i++) {
            System.out.println("Se il voto all'esame 2 sara' " + punteggioSeguente[i]);
            System.out.println("la media sara' uguale a " + punteggioMedio[i]);

        }
    }

    public static double[] ottieniArrayDiMedie(int punteggioIniaziale, int[] punteggioSeguente) {
        double[] temp = new double[punteggioSeguente.length];

        for (int i = 0; i < temp.length; i++) {
            temp[i] = getMedia(punteggioIniaziale, punteggioSeguente[i]);

        }
        return temp;

    }

    public static double getMedia(int n1, int n2) {
        return (n1 + n2) / 2.0;
    }



    //Indovina il codice:
    public static void disinnescaLaBomba() {
        String codiceSegreto = "68598";
        boolean vittoria = false;
        int tentativiMassimi = 9;
        int tentativi = 0;
        Scanner input = new Scanner(System.in);
        String codice = input.nextLine();

        System.out.println("Disinnesca la bomba! Indovina il codice a 5 cifre.");

        while (tentativi < tentativiMassimi) {
            int somma = 0;
            int indovinati = 0;

            if (codice.equals(codiceSegreto)) {
                System.out.println("Bravo! Hai indovinato e la bomba è disinnescata!");
                tentativi = tentativiMassimi;
                vittoria = true;
                break;

            } else {
                if (codice.toLowerCase().contains("abcdefghijklmopqrstuvwxyz")) {
                    tentativi++;
                    System.out.println("Non inserire lettere, solo numeri!");
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) + 1) + " tentativi, prima che la bomba esploda...");
                    codice = input.nextLine();

                } else if (codice.length() < codiceSegreto.length() || codice.length() > codiceSegreto.length()) {
                    tentativi++;
                    System.out.println("Hai inserito " + codice.length() + " numeri, devi inserirne 5!");
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) + 1) + " tentativi, prima che la bomba esploda...");
                    codice = input.nextLine();

                } else {
                    for (int i = 0; i < codice.length(); i++) {
                        if (codice.charAt(i) == codiceSegreto.charAt(i)) {
                            somma += codice.charAt(i);
                            indovinati++;


                        }
                    }
                    tentativi++;
                    System.out.println("Quasi... hai indovinato " + indovinati + " numeri su 5 e la loro somma è " + somma);
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) + 1) + " tentativi, prima che la bomba esploda...");
                    codice = input.nextLine();

                }
            }
        }
        if (!vittoria) {
            System.out.println("BOOOOOOOOOOOM...");

        }
        input.close();

    }

    //Ordine crescente
    public static boolean ordine() {
        System.out.println("Inserisci 10 numeri:");
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = Integer.parseInt(input.nextLine());
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    public static int[] inverti(int[] array) {
        int cont = 0;
        int[] arrayInvertito = new int[array.length];

        for (int i = arrayInvertito.length - 1; i >= 0; i--) {
            arrayInvertito[cont] = array[i];
            cont++;

        }

        System.out.println("Array invertito:");
        for (int i = 0; i < arrayInvertito.length; i++) {
            System.out.print(arrayInvertito[i] + " ");
        }

        return arrayInvertito;
    }

    public static String tuttoAttaccato(String parola) {
        return parola.replaceAll(" ", "");

    }










}


