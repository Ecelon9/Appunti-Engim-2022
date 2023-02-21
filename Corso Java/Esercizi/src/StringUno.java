
public class StringUno {

	public static void main(String[] args) {

		char carattere;
		String stringa = "viva le aiuole";
		
		for (int i = 0; i < stringa.length(); i++) {
			
			carattere = stringa.charAt(i);
			if (carattere == 'a' || carattere == 'e' ||
				carattere == 'i' || carattere == 'o' ||
				carattere == 'u') {
				
				System.out.print(carattere);
			}
			
		}
		
				
	}

}
