import java.util.Scanner;

public class EsCasa {
    public static void main(String[] args) {

        //Esercizio 1:
        //disinnescaLaBomba();

        //Esercizio 2:
        System.out.println(ordine());

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

            if(codice.equals(codiceSegreto)) {
                System.out.println("Bravo! Hai indovinato e la bomba è disinnescata!");
                tentativi = tentativiMassimi;
                vittoria = true;
                break;

            } else {
                if (codice.toLowerCase().contains("abcdefghijklmopqrstuvwxyz")) {
                    tentativi++;
                    System.out.println("Non inserire lettere, solo numeri!");
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) +1) + " tentativi, prima che la bomba esploda...");
                    codice = input.nextLine();

                } else if (codice.length() < codiceSegreto.length() || codice.length() > codiceSegreto.length()) {
                    tentativi++;
                    System.out.println("Hai inserito " + codice.length() + " numeri, devi inserirne 5!");
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) +1) + " tentativi, prima che la bomba esploda...");
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
                    System.out.println("Riprova! Ti rimangono ancora " + ((tentativiMassimi - tentativi) +1) + " tentativi, prima che la bomba esploda...");
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

        for (int i = 0; i < array.length -1; i++) {
            if (array[i] > array[i +1])
                return false;
        }
        return true;
    }



    }

