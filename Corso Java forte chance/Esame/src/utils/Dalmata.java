package utils;

public class Dalmata extends Cane {
	
	protected int età;
	
	public Dalmata(String nome, double peso, int età) {
		super(nome, peso);
		this.età = età;
	}
	
	public void emetteVerso() {
		System.out.println("Il dalmata "+nome+" abbaia");
	}
	
	public void mangia() {
		System.out.println(nome + " mangia una crocchetta.");
	}

}
