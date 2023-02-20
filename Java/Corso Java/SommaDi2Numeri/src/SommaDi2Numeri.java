
public class SommaDi2Numeri {

	//Attributi
	private int primoNum;
	private int secondoNum;
	private int risultato;
		
	//Costruttore
	public SommaDi2Numeri() {
		this.primoNum = 0;
		this.secondoNum = 0;
		this.risultato = 0;
	}
	
	public SommaDi2Numeri(int primoNum, int secondoNum) {
		this.primoNum = primoNum;
		this.secondoNum = secondoNum;
		this.risultato = 0;
	}
	
	//Metodi
	public int getPrNum() {
		return primoNum;
	}
	
	public void setPrNum(int primoNum) {
		this.primoNum = primoNum;
	}
	
	public int getScNum() {
		return secondoNum;
	}
	
	public void setScNum(int secondoNum) {
		this.secondoNum = secondoNum;
	}
	
	
	public void somma() {
		risultato = primoNum + secondoNum;
	}
	
	public int getRisultato() {
		return risultato;
	}
	
	public void stampa() {
		System.out.println("Il risultato è: " + this.risultato);
	}
	
}
