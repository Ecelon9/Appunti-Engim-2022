import java.util.*;

public class Test {

    public static void main(String[] args) {
        
        Studente stud = new Studente();
        stud.setNome("Chris");
        stud.setCognome("Recalati");
        stud.setEta(45);

        
        /**
         * Qui passiamo l'array dei voti.
         * Un moto alternativo per passare un ArrayList è inizializzarlo direttamente 
         * dentro le tonde, per poi richiamare la classe Arrays e il metodo asList.
         * Poi inserire i valori per l'ArrayList
         */
        
         /*
        stud.setVotiMateria(new ArrayList<>(Arrays.asList(7.25, 8.5, 6.75)));
        
        for (double voto : stud.getVotiMateria()) {
            System.out.println("Il voto è: " + voto);
            
        }

        System.out.println("La media è: " + stud.calcolaMediaVoti());
        */

        // test eccezioni

        Studente stud2 = new Studente();
        stud2.setNome("Ciccio");
        stud2.setCognome("Valenti");
        stud2.setEta(45);
        HashMap<String, List<Double>> votiMateria = new HashMap<>();

        votiMateria.put("Matematica", new ArrayList<Double>(Arrays.asList(4.5, 6.25, 3.75)));
        votiMateria.put("Italiano", new ArrayList<Double>(Arrays.asList(4.0, 5.25, 6.75)));
        stud2.setVotiMateria(votiMateria);
        
        System.out.println(stud2.calcolaMediaVotiPerMateria("Matematica"));

    }
}
