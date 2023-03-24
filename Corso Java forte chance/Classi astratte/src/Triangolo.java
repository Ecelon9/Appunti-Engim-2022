
public abstract class Triangolo extends FormeGeometriche {

	protected int base;
	protected int altezza;
	protected int lato;
	
	public Triangolo(int base, int altezza, int lato) {
		this.base = base;
		this.altezza = altezza;
		this.lato = lato;
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
	
	public int getLato() {
		return lato;
	}
	
	public void setLato(int lato) {
		this.lato = lato;
	}
	
	public double area() {
		return (base * altezza) / 2;
	}
	
	
	
	
}
