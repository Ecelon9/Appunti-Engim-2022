package utils;

public class Gallina extends EssereVivente implements Animale {

	public Gallina(String nome, double peso) {
		super(nome, peso);
	}

	public void emetteVerso() {
		System.out.println("La gallina " + nome + " chioccia.");
	}
	
	public void mangia() {
		System.out.println("La gallina " + nome + " becca il mangime.");
	}
		
}
