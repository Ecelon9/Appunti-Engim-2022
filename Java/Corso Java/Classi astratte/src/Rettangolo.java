
public class Rettangolo extends FormeGeometriche{

	protected int base;
	protected int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltezza() {
		return altezza;
	}
	
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	public double area() {
		return base * altezza;
	}
	
	public double perimetro() {
		return (2 * (base *altezza));
	}
	
	public String chiSono() {
		return "Rettangolo";
	}
	
	
}
