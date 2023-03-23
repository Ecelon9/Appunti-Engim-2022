
public class StringDue {

	public static void main(String[] args) {


		String stringa = "viva le aiuole";
		
		System.out.println(contaLettera ('o', stringa));
		
		
	}

	
	static int contaLettera(char c, String str) {
		
		int contatore = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				contatore++;
				
			}
		}
		
		return contatore;
	}
	
	
}


