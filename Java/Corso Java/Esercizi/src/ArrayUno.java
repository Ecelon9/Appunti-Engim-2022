
public class ArrayUno {

	public static void main(String[] args) {
		
		// Trovare il valore maggiore di un array
		
		int[] array = {55, 21, 37, 89, 91, 203, 2};
		int valMax = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (valMax < array[i]) {
				
				valMax = array[i];
				
			}
		}
		
		System.out.print(valMax);

	}

}


















