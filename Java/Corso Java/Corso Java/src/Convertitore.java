
import java.util.Scanner;

public class Convertitore {

	public static void main(String[] args) {

		double euro = 0;
		double lire = 0;
		double tassoCambio = 1936.27;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il valore in euro:");
		euro = input.nextDouble();
		lire = euro * tassoCambio;
		System.out.println(euro + " €, equivalgono a: " + lire + " lire.");
		input.close();
		
	}

}







