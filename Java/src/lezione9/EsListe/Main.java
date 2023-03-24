package EsListe;

public class Main {
    public static void main(String[] args) {

        Node n = new Node(1, new Node(6));
        System.out.println("Stampo: " + n);

        /*
        System.out.println("Stampo: " + n.get(0));
        System.out.println("Stampo: " + n.get(1));
        System.out.println("Stampo: " + n.get(3)); // errore, punta a null - non esiste la cella di memoria
        */

        n.addTop(4);
        System.out.println("Stampo: " + n);

        n.set(9, 1);
        System.out.println("Stampo: " + n);

        n.addBot(3);
        System.out.println("Stampo: " + n);

        n.sommaN(1);
        System.out.println("Stampo: " + n);

    }
}