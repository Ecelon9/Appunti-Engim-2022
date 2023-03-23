package veicoli;

public class VeicoloAMotore {
	
	protected int annoImmatricolazione;
	protected String marca;
	protected String tipoAlimentazione;
	protected int cilindrata;
	
	public VeicoloAMotore(int anno, String marca, String alim, int cc) {
		annoImmatricolazione = anno;
		this.marca = marca;
		tipoAlimentazione = alim;
		cilindrata = cc;
	}
	
	public int getAnnoImm() {
		return annoImmatricolazione;
	}
	
	public void setAnnoImm(int anno) {
		annoImmatricolazione = anno;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getAlim() {
		return tipoAlimentazione;
	}
	
	public void setAlim(String alim) {
		tipoAlimentazione = alim;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}
	
	public void setCilindrata(int cc) {
		cilindrata = cc;
	}
	
	public String toString() {
		return "Anno di immatricolazione: " + annoImmatricolazione + 
				"Marca: " + marca + 
				"Alimentazione: " + tipoAlimentazione + 
				"Cilindrata : " + cilindrata;
	}
	
	

}
