
public class TriangoloEquilatero extends Triangolo {

	public TriangoloEquilatero(int base, int altezza, int lato) {
		super(base, altezza, lato);
	}
	
	public double perimetro() {
		return lato * 3;
	}
	
	public String chiSono() {
		return "Rettangolo Equilatero";
	}
	
	public void setDisegno() {
		
		for(int i = 0; i < riga; i++) {
			for(int j = 0; j < colonna; j++) {
				if(j == 0 || i == riga -1) {
					forma[i] [j] = '*';
				}
				
				if(j <= i) {
					forma[i] [j] = '*';
				}
			}
		}
	}
	
}
