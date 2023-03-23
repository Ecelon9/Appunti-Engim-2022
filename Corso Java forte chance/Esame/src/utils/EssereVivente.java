package utils;

public class EssereVivente {
	
	protected String nome;
	protected double peso;
	
	
	public EssereVivente(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
