
public class RettangoloIsoscele extends Triangolo{

	public RettangoloIsoscele(int base, int altezza, int lato) {
		super(base, altezza, lato);
	}
	
	public double perimetro() {
		return (2 * lato) + base;
	}
	
	public String chiSono() {
		return "Rettangolo Isoscele";
	}
	
	
}
