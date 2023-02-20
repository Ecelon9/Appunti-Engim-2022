
public class ForQuattro {

	public static void main(String[] args) {
		/*Stampare a video la seguente figura:
			
			*****
			****
			***
			**
			*

		 */

		int riga;
		int colonna;
		
		for (colonna = 0; colonna < 5; colonna++) {
	
			for (riga = 4; riga >= colonna; riga--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Figura opposta
		
		for (colonna = 0; colonna < 5; colonna++) {
	
			for (riga = colonna; riga >= 0; riga--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}

}










