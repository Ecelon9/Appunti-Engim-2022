
public class Quadrato extends FormeGeometriche{

	protected int lato;
	
	public Quadrato(int lato) {
		this.lato = lato;
	}
	
	public int getLato() {
		return lato;
	}
	
	public void setLato(int lato) {
		this.lato = lato;
	}
	
	public double area() {
		return this.lato * this.lato;
	}
	
	public double perimetro() {
		return this.lato * 4;
	}
	
	public String chiSono() {
		return "Quadrato";
	}
	
	
	public void setDisegno() {
		
		for(int i = 0; i < riga; i++) {
			for(int j = 0; j < colonna; j++) {
				if(i == 0 || i == riga -1) {
					forma[i] [j] = '*';
				} else if(j == 0 || j == colonna -1) {
					forma[i] [j] = '*';
				}
			}
		}
	}
	
	
}
