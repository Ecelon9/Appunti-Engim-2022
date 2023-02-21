package veicoli;

public class Auto extends VeicoloAMotore {
	
	protected int numPorte;
	
	public Auto(int anno, String marca, String alim, int cc, int numPorte) {
		super(anno, marca, alim, cc);
		this.numPorte = numPorte;
	}
	
	public int getPorte() {
		return numPorte;
	}
	
	public void setPorte(int numPorte) {
		this.numPorte = numPorte;
	}
	
	public String toString() {
		return super.toString() + 
				"Numero portiere: " + numPorte;
	}
	

}
