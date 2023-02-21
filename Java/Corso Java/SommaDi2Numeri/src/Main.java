
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int primoNum = 0;
		int secondoNum = 0;
		int risultato = 0;
		
		
		System.out.print("Inserisci il Primo numero: ");
		primoNum= input.nextInt();
		System.out.print("Inserisci il Secondo numero: ");
		secondoNum = input.nextInt();
		
		SommaDi2Numeri addizione2 = new SommaDi2Numeri(primoNum, secondoNum);
		addizione2.primoNum;
		
		
		

		SommaDi2Numeri addizione1 = new SommaDi2Numeri(16, 14);
		
		addizione1.somma();
		addizione1.stampa();
		
		
	}

}
