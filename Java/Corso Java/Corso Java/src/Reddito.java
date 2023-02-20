
import java.util.Scanner;


public class Reddito {

	public static void main(String[] args) {
		
		int reddito;
		int tasse;
		double spese;
		
		Scanner input = new Scanner (System.in);
		System.out.println("Inserisci il reddito: ");
		
		reddito = input.nextInt();
		
		if (reddito <= 10000) {
			tasse = 20;
			spese = (reddito * tasse)/100;
			System.out.println("Devi pagare " + spese +"€");
		} else {
			tasse = 30;
			spese = (reddito * tasse)/100;
			System.out.println("devi pagare " + spese +"€");
		}
		input.close();
		
		
	}

}
