
public class ArrayTreQuattro {

	public static void main(String[] args) {
	
		int valore = 5;
		int[] numeri = {1, 3, 5, 7, 9};
		boolean check = contains(valore, numeri);
		System.out.println(valore + " è presente nell'array? " + check);
		boolean crescente = isCrescente(numeri);
		System.out.print("I valori nell'array, sono in ordine crescente? " + crescente);
		
	}

	static boolean contains(int e, int[] array) {

		for (int i = 0; i < array.length; i++) {
			if (e == array[i]) {
				return true;
			}
		}
		
		return false;
		
	}

	static boolean isCrescente (int[] array) {
		
		for (int i = 0; i< array.length - 1; i++) {
			if (array[i] < array[i + 1]) {
				return true;
			}
		}
		
		return false;
	}
		
		
	}




