
public class ForCinque {

	public static void main(String[] args) {
		/* Stampare la figura:
		A
		BC
		DEF
		GHIJ
		KLMNO
			
		*/
		
		
		char carattere = 'A';
		int riga;
		int colonna;
		
		
		for (colonna = 0; colonna < 5; colonna++) {
			
			for (riga = colonna; riga >= 0; riga--) {
				System.out.print(carattere);
				carattere++;
			}
			
			System.out.println();
		}
	}

}
