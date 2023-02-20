package utils;

public class Mucca extends EssereVivente implements Animale {
	public Mucca(String nome, double peso) {
		super(nome, peso);
	}
	@Override
	public void emetteVerso() {
		System.out.println("La mucca "+nome+" muggisce");
	}
	
	public void mangia() {
		System.out.println("La mucca " + nome + " bruca l'erba.");
	}
	
}
