public class Main {
    public static void main(String[] args) {

        Bottiglia b = new BottigliaConTappo(1500);
        System.out.println(b);

        /*
        Differenza fra Tipo REALE e Tipo APPARENTE:
        Quando creiamo una nuova istanza di una classa, il tipo REALE di quell'istanza è la classe stessa.
        In questo caso (new)BottigliaConTappo.
        Il tipo APPARENTE è l'oggetto che punta a quella classe. In questo caso: b.

        In questo esempio stiamo creando un oggetto di tipo Bottiglia, il cui tipo reale è BottigliaConTappo.
        Quindi noi possiamo utilizzare i metodi di bottiglia, ma non quelli di BottigliaConTappo, perchè
        BottigliaConTappo è anche di tipo Bottiglia.
        Ma questo non vuol dire che Bottiglia non abbia accesso ai metodi di BottigliaConTappo
        --Vedere il system out--
         */

        b.riempi(1300);
        BottigliaConTappo bt = (BottigliaConTappo) b;
        //Per poter usare il metodo di BottigliaConTappo, dobbiamo fare un cast
        //((BottigliaConTappo)b).apri();
        bt.apri();

        Bottiglia b1 = bt; //In questo punto stiamo ricastando bt a Bottiglia

        System.out.println(b);
        System.out.println(bt);
        System.out.println(b1);

        BottigliaConMateriale bm = new BottigliaConMateriale(3000, Materiale.METALLO);
        System.out.println(bm);




    }
}