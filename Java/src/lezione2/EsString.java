import java.util.Scanner;


public class EsString {
    public static void main(String[] args) {
        
    /*
    String s = "Ciao";
        System.out.println(s + " è lungo " + s.length());

    String sub = s.substring(1, 3);
        System.out.println(sub);
    */


    String nome = "Matteo";
        //System.out.println(nome.substring(1, nome.length()-1));

    String nomeLunghissimo = "kjdlvjndgfbdfgdfjefliu";
        //System.out.println(nomeLunghissimo.substring(1, nomeLunghissimo.length()-1));
    
    


    Scanner input = new Scanner(System.in);

    System.out.println("Inserisci il tuo nome: ");

    String nomeInput = input.nextLine();

    System.out.println("E' uguale al mio nome? " + nomeInput.equalsIgnoreCase(nome));

    for (int i = 0; i < nome.length(); i++) {
        System.out.println(nome.charAt(i));
        
    }


    input.close();


    }
    
}
