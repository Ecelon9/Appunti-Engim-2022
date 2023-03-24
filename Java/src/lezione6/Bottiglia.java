
// Programmazone ad Oggetti

public class Bottiglia {
        private int capacita;
        private int quantita;

        // Il costruttore è un metodo che viene chiamato quando viene istanziata una classe;
        public Bottiglia(int capacita, int quantita) {
                if (capacita < 0) {
                        this.capacita = 0;

                } else {
                        this.capacita = capacita;

                }

                if (quantita < 0) {
                        this.quantita = 0;

                } else {
                        this.quantita = quantita;
                }

        }

        //overloading è chiamare due metodi con lo stesso nome e passargli parametri diversi
        //overriding è modificare la firma di un metodo

        //overloading del costruttore
        public Bottiglia(int capacita) {
                this(capacita, 0);      //sto richiamando il costruttore di questa classe
        }                                      // e sto facendo l'assegnazione degli attributi


        @Override
        public String toString() {
                return "Bottiglia: " +
                        "capacita = " + capacita +
                        ", quantita = " + quantita;
        }


        /* metodi di classe(metodi statici) : metodi di instanza.
         *i metodi di istanza sono quelli che sono collegati all'istanza (non static)
         *e per usarli, devo avere un istanza della classe.
         *
         *i metodi di classe posso usarli richiamando la classe, senza aver creato prima l'istanza.
         * */

        public void riempi(int q) {
                if (q < 0) {
                        System.out.println("Errore");
                } else {
                        quantita += q;
                        if (quantita > capacita) {
                                quantita = capacita;
                        }
                }


        }

        public void svuota(int q) {
                if (q < 0) {
                        System.out.println("Errore");
                } else {
                        quantita -= q;
                        if (quantita > capacita) {
                                quantita = capacita;
                                //quantita = Math.max(0, quantita-q);
                        }
                }
        }
}
