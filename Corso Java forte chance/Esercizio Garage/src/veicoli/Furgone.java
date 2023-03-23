package veicoli;

public class Furgone extends VeicoloAMotore{

	protected int capacit‡Carico;
	
	public Furgone(int anno, String marca, String alim, int cc, int capCar) {
		super(anno, marca, alim, cc);
		capacit‡Carico = capCar;
	}
	
	public int getCapCar() {
		return capacit‡Carico;
	}
	
	public void setCapCar(int capCar) {
		capacit‡Carico = capCar;
	}
	
	public String toString() {
		return super.toString() + 
				"Capacit‡ di carico: " + capacit‡Carico;
	}
	
	
}
