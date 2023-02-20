
import java.util.Scanner;


public class MainConto {

	public static void main(String[] args) {
		
		char opzione = ' ';
		Scanner input = new Scanner(System.in);
		ContoCorrente mioConto = new ContoCorrente(50);

		mioConto.verificaPin();

		
		while (opzione != 'e') {
		
		System.out.println("Scegliere un operazione:");
		System.out.println("D, per deposito, P, per prelievo, L, leggi saldo, E, per uscire.");
		
		opzione = input.next().charAt(0);
		
		switch (opzione) {
		case 'd':
			System.out.print("Insercisci l'importo del deposito");
			mioConto.deposito(input.nextInt());			
			break;
		case 'p':
			System.out.print("Insercisci l'importo del prelievo");
			mioConto.prelievo(input.nextInt());	
			break;
		case 'l':
			System.out.println("Il tuo saldo è di: " + mioConto.getSaldo());
			break;
				}
		}	
		
		input.close();	

	}

}
