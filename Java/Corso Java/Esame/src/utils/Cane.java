package utils;

public class Cane extends EssereVivente implements Animale {
	public Cane(String nome, double peso) {
		super(nome, peso);
	}
	@Override
	public void emetteVerso() {
		System.out.println("Il cane "+nome+" abbaia");
	}
	
	public void mangia() {
		System.out.println("Il cane " + nome + " mangia l'osso.");
	}
	
}
