
package utils;

public class Alce extends EssereVivente implements Animale {
	
	public Alce(String nome, double peso) {
		super(nome, peso);
		
	}
	@Override
	public void emetteVerso() {
		System.out.println("Alce "+nome+" bramisce");
	}
	
	public void mangia() {
		System.out.println("L'alce " + nome + " bruca l'erba.");
	}
	
}
