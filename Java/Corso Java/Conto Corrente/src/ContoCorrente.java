
import java.util.Scanner;

public class ContoCorrente {

	//Attributi
	private double saldo;
	private Scanner input;
	private final int pin = 123;
	
	
	
	//Costruttore
	public ContoCorrente(double saldo) {
		this.saldo = saldo;
		input = new Scanner(System.in);
	}
	
	//Metodi
	
	public boolean verificaPin() {
		System.out.print("Inserire il pin: ");
		int ins = input.nextInt();
		boolean check = java.util.Objects.equals(ins, pin);		
		
		 if (check != true) {
			System.out.print("PIN ERRATO");				
			System.exit(0);
			return false;
			} else {
			return true;
			}  
		
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if (saldo <= 0) {
			System.out.println("valore saldo errato. Saldo impostato a 0");
			this.saldo = 0;
		} else {
			this.saldo = saldo;
		}
	}
	
	public void deposito(int importo) {
		
		if (importo < 0) {
			System.out.print("Importo negativo");
		} else {
			
			System.out.print("Premere 1 per depositare contanti, 2 per depositare un assegno: ");
			int scelta = input.nextInt();
			
			switch(scelta) {
			case 1:
				depositoContanti(importo);
				break;
			case 2:
				depositoAssegno(importo, 20);
				break;
			}
		}

	}
	
	private void depositoContanti(int importo) {
		saldo = saldo + importo;
	}
	
	private void depositoAssegno(int importo, int commissione) {
		saldo = saldo + importo - commissione;
	}
	
	
	public boolean prelievo(int importo) {
		if (importo > this.saldo) {
			System.out.print("Importo maggiore di saldo");
			return false;
		} else if (importo >= 30) {
			prelievoConCommissione(importo, 1);
			
		} else {
			prelievoContanti(importo);
			
		}
		
		return true;
	}
	
	public void prelievoContanti(int importo) {
		this.saldo = saldo - importo;
	}
	
	public void prelievoConCommissione(double importo, int commissione) {
		double tassa = (importo * commissione) / 100;
		if (importo >= 30) {
			importo = importo - tassa - 2;
		} else {
			importo = importo - tassa;
		}
		
		
	}
	
	
	
}
