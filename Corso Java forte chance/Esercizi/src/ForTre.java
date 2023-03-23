
import java.util.Scanner;

public class ForTre {

	public static void main(String[] args) {
		
		int[] tabellina = new int[11];
		int base = 0;
		int i = 0;
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Quale tabellina vuoi sapere? ");
		base = input.nextInt();
		
		for (i = 0; i < tabellina.length; i++) {
			
			tabellina[i] = base * i;
			System.out.print(tabellina[i] + " - ");
			
		}
		
		input.close();
		
		}
	
		
	}









