

public class ArraySei {

	public static void main(String[] args) {

		String[] array = {"cose + ", "cose = "};
		String frase = "Tutte cose";
		String[] nuovaFrase = addString(frase, array);
		
		for (int i = 0; i < nuovaFrase.length; i++) {
			System.out.print(nuovaFrase[i]);
			
		}
		
	}


	public static String [] addString(String s, String[] a) {
		
		
		String[] array2 = new String[a.length + 1];
		
		int i = 0;	
		for (i = 0; i < a.length; i++) {
			array2[i] = a[i];
		} 
		
		array2[i] = s;

		return array2;
		
	}
	 
	

}	
		
		
		










