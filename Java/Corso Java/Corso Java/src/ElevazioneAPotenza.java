
import java.util.Scanner;

public class ElevazioneAPotenza {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int	base = 0;		
		int esponente = 0;	
		long totale = 0;
		int i = 1;
				
		System.out.print("Scegli la base della potenza: ");
		base = input.nextInt();
		System.out.print("Scegli l'espondente: ");
		esponente = input.nextInt();	
		totale = base;
		
		while (i < esponente) {
			
			totale = totale * base;
			
			i++;

		} 
				
		System.out.print(base + " elevatato a " + esponente 
						+ " = " + totale);
		input.close();
	
	}
	
}











