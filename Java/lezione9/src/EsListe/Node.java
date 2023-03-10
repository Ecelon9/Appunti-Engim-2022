package EsListe;

public class Node {
    private int value;
    private Node next; // in creazione della classe, next punta a se stesso
    //nei metodi sotto cicla su se stesso. Se esiste, next(quindi se stesso) != null, quindi value = n.

    //Costruttori
    public Node(int value) {
        this.value = value;
        this.next = null;

    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;

    }

    @Override
    public String toString() {
        if(next == null) {
            return String.valueOf(value);

        } else {
            return  value +  " " + next.toString();

        }
    }



    public int get(int i) {

        if (i == 0) {
            return value;   //quando l'indice vale 0, restituisce l'oggetto in prima posizione

        } else {
            return next.get(i-1);
            /*
            Se voglio il valore dopo, inserisco la lunghezza dell'array-1 per restare
            all'interno dell'array e recupero l'elemento a quella posizione.
            i viene decrementato e recupera l'elemento a quella posizione
            fin quando i non sarà 0, a quel punto returna tutti i valori recuperati.
            */
        }
    }

    /**
     * setta un nuovo valore in una posizione che esiste già
     */
    public void set(int value, int i) {
        if (i == 0) {
            this.value = value;

        } else {
            next.set(value, i-1);

        }
    }

    /**
     * aggiunge un nuovo valore alla pos 0, traslando le posizioni esistenti
     */
    public void addTop(int value) {
        //creo un nuovo nodo che ha lo stesso next e lo stesso value
        //poi modifico il mio next in modo che sia quello appena creato
        this.next = new Node (this.value, this.next);

        //modifico il mio value in modo che sia quello passato
        this.value = value;

    }

    /**
     * aggiunge nuovo valore in coda.
     * se trovo null, allora creo nuovo nodo e assegno il valore passato
     * altrimenti vado avanti portandomi il valore passato
     */
    public void addBot(int value) {
        if (this.next == null) {
            this.next = new Node(value);

        } else {
            next.addBot(value);

        }
    }

    public void sommaN(int n) {
        this.value += n;

        if (this.next != null) {
            next.sommaN(n);

        }
    }





}