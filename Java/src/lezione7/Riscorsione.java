public class Riscorsione {
    public static void countdown(int i) {
        System.out.println(i);
        if(i > 0) {
            countdown( i-1);
        }
    }

    public static int fattoriale(int n) {
        int risultato = n;
        if (n < 1) {
            return 1;
        }
        risultato *= fattoriale(n-1);
        return risultato;

    }

    //Stampa numeri pari da 0 a n;
    public static void numPari(int n) {
        if (n > 0) {
            numPari(n-1);

        }
        if (n % 2 == 0) {
            System.out.println(n);

        }
    }

    public static void main(String[] args) {
        //countdown(10);
        //System.out.println(fattoriale(0));
        numPari(9);

    }


}
