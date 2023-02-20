package utils;

public class Gatto extends EssereVivente implements Animale {
	public Gatto(String nome, double peso) {
		super(nome, peso);
		
	}
	@Override
	public void emetteVerso() {
		System.out.println("Il gatto "+nome+" mioagola");
		
	}
	
	public void mangia() {
		System.out.println("Il gatto " + nome + " mangia le crocchette.");
	}

}
