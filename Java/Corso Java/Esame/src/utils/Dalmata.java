package utils;

public class Dalmata extends Cane {
	
	protected int et�;
	
	public Dalmata(String nome, double peso, int et�) {
		super(nome, peso);
		this.et� = et�;
	}
	
	public void emetteVerso() {
		System.out.println("Il dalmata "+nome+" abbaia");
	}
	
	public void mangia() {
		System.out.println(nome + " mangia una crocchetta.");
	}

}
