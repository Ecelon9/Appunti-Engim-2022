

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calcolatrice {

	public static void main(String[] args) {
		
		
		int primoNum = 0;
		int secondoNum = 0;
		int risultato = 0;
		char operatore = ' ';
		
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Inserisci il primo numero: ");
		try {
			primoNum = input.nextInt();
		} catch(InputMismatchException errore) {
			System.out.println("Il valore inserito non è di tipo corretto");
			System.out.println(errore);
			primoNum = 0;
		}
		
		System.out.print("Inserisci il secondo numero: ");
		try {
			secondoNum = input.nextInt();
		} catch(InputMismatchException errore) {
			System.out.println("Il valore inserito non è di tipo corretto");
			System.out.println(errore);
			secondoNum = 0;
		}
			
		
		while (operatore != '+' && operatore != '-' &&
				operatore!= '*' && operatore != '/') {
			
			System.out.print("Scegliere l'operatore: ");
			operatore = input.next().charAt(0);
			
			switch (operatore) {
			
			case '+':
				risultato = primoNum + secondoNum;
			break;
			case '-':
				risultato = primoNum - secondoNum;
			break;
			case '*':
				risultato = primoNum * secondoNum;
			break;
			case '/':
				risultato = primoNum / secondoNum;
			break;
			default:
				System.out.print("Devi scegliere un operatore! ");
			break;
			
			}
		}
		
			
		System.out.print("il risultato è: " + risultato);
		input.close();

				
	}

}
