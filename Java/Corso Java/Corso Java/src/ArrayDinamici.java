
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class ArrayDinamici {
	
	private static Iterator<Integer> iter;

	public static void main(String[] args) {
	
	Random rand = new Random();
	
	ArrayList<Integer> listaInteri = new ArrayList<Integer>();
	
	
	while(listaInteri.size() <= 10) {
		listaInteri.add(rand.nextInt(10));
	}
	
	for(Integer i:listaInteri) {
		System.out.println(i);
	}
	
	
	iter = listaInteri.iterator();
	while(iter.hasNext()) {
		Integer i = iter.next();
		System.out.println(i);
	}
	
	
	
	
	
	
	
	}
}