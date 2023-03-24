
public class ArrayDue {

	public static void main(String[] args) {
		

		int[] array = {55, 21, 37, 203, 91, 45, 2};
		int valMax = 0;
		int indice = 0;
		
		for (int i = 0; i < array.length; i++) {
			if (valMax < array[i]) {
				
				valMax = array[i];
				indice = i;
			} 
		}
		
		System.out.println("Il numero maggiore è: " + valMax);
		System.out.print("Nella posizione n° " + indice);


	}

}