

public class Tragitto {

	public static void main(String[] args) {

		int percorso = 5; //km
		int tempo = 15; //minuti
		int totale = 0;
		int i = 0;
		
		for (i = 0; i < percorso; i++) {
			
			totale = totale + tempo;
			
		};
		
		System.out.print(totale);

	}

}
