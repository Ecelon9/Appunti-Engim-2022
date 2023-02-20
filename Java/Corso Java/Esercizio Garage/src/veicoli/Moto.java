package veicoli;

public class Moto extends VeicoloAMotore{
	
	protected String tipologia;
	protected int numTempiMotore;
	
	public Moto(int anno, String marca, String alim, int cc, String tipologia, int numTempi) {
		super(anno, marca, alim, cc);
		this.tipologia = tipologia;
		numTempiMotore = numTempi;
	}
	
	public String getTipo() {
		return tipologia;
	}
	
	public void setTipo(String tipo) {
		tipologia = tipo;
	}
	
	public int getTempi() {
		return numTempiMotore;
	}
	
	public void setTempi(int numTempi) {
		numTempiMotore = numTempi;
	}
	
	public String toString() {
		return super.toString() + 
				"Modello: " + tipologia + 
				"Tempi motore: " + numTempiMotore;
	}
	
	

}
