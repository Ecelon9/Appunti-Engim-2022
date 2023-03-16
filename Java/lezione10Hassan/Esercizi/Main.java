package lezione10Hassan.Esercizi;

public class Main{

   public static void main(String[] args) {
    
    Persona p1 = new Persona("Matteo", "Bologna", 29);

    System.out.println(p1);

    p1.setNome("Genoveffo");

    System.out.println(p1);
    
    ContoCorrente c1 = new ContoCorrente();
    ContoCorrente c2 = new ContoCorrente(2000);

    System.out.println(c1);
    System.out.println(c2);

    c2.deposita(1100);
    System.out.println("Saldo: " + c2.getSaldo());

    c2.deposita(99999);
    System.out.println("\n");

    ////////////////////////////////////////////////////////////////////////////

    Operaio op = new Operaio("Pino", "Magalli", 40, 1200, "Determinato");
    System.out.println("Operaio:\n" + op + "\n");

    Studente stud = new Studente("Ajeje", "Brazorf", 24, "Belle arti");
    System.out.println("Studente:\n" + stud + "\n");


   }    
}
