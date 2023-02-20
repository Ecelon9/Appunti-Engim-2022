
public class CorsoLaurea {
	
	protected int codiceCorso = 2000;
	protected String denominazione;
	protected boolean specialistica;
	//Valore di default è false
		
	public CorsoLaurea(String denominazione, boolean specialistica) {
		
		this.denominazione = denominazione;
		this.specialistica = specialistica;
		codiceCorso = codiceCorso++;
		
	}
		
	public int getCodiceCorso() {
		return codiceCorso;
	}
	
	public String getDenom() {
		return denominazione;
	}
	
	public void setDenom(String denom) {
		denominazione = denom;
	}
	
}
