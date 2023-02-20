
public class ArrayCinque {

	public static void main(String[] args) {
		/* Scrivere un programma MediaMultipliDiTre che 
		calcoli la media di un array di numeri interi, 
		considerando i soli numeri divisibili per tre. */

		int[] numeri = {21, 50, 60, 81, 65, 43, 19};
		int cont = 0;
		int somma = 0;
		int media = 0;
		
		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] % 3 == 0) {
				somma = somma + numeri[i];
				cont++;
			}
		}
		
		
		System.out.println("totale " + somma);
		media = somma / cont;
		System.out.print("La media dell'array è: " + media);
		
	}

}
