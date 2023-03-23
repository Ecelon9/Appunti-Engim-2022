

import java.util.Scanner;

public class SommaDi2Numeri {
	
	public static void main(String[] args) {
		
		int primoNum = 0;
		int secondoNum = 0;
		int somma = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci primo numero:");
		primoNum = input.nextInt();
		System.out.println("Inserisci secondo numero");
		secondoNum = input.nextInt();
		somma = primoNum + secondoNum;
		System.out.println("La somma dei numeri è: " + somma);
		input.close();
		
	}

	

}





