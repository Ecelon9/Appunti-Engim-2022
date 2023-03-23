
public class Rettangolo {

	//Attributi
	private int altezza;
	private int base;
	
	
	//Costruttore
	public Rettangolo() {
		this.altezza = 0;
		this.base = 0;
	}
	
	//Metodo per l'area
	public int getAltezza() {
		return altezza;
	}
	
	public void setAltezza (int altezza) {
		if (altezza <= 0) {
			System.out.println("Altezza errata");
		} else {
			this.altezza = altezza;
		}
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase (int base) {
		if (base <= 0) {
			System.out.println("Base errata");
		} else {
			this.base = base;
		}
	}
	
	
	
	public int calcolaArea() {
		int area;
		area = base * altezza;
		return area;
	}
	
	//Metodo per il perimetro
	public int perimetro() {
		return 2 * (base + altezza);
		}
	
	//metodo per la diagonale
	public double diagonale() {
		double diagonale;
		diagonale = Math.sqrt((base^2) + (altezza^2));
		return diagonale;
	}
	
}
