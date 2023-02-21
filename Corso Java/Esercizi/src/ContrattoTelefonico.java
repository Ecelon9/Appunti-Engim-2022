
public class ContrattoTelefonico {

	//attributi
	protected String utente;
	protected String numeroTel;
	protected double costoTelefonate;
	protected int numTelefonate;
	private static final double CostoAlSecondo = 0.05;
	
	
	//costruttore
	public ContrattoTelefonico(String nome, String numeroTel) {
		utente = nome;
		this.numeroTel = numeroTel;
		costoTelefonate = 0;
		numTelefonate = 0;
		
	}
	
	
	//metodi
	public String datiUtenza() {
		return "Nome utente: " + utente + ", Numero di telefono: " + numeroTel + ", Chiamate effettuate: " + numTelefonate + ", Costo: " + costoTelefonate;
		
	}
	
	public void aggiornaBolletta(double numSecondi) {
		if (numSecondi > 0) {
		costoTelefonate = costoTelefonate + numSecondi * CostoAlSecondo;
		numTelefonate++;
		}
	}
	
	public void aggiungiCosti(double costo) {
		costoTelefonate = costoTelefonate + costo;
		
	}
	
	public double getBolletta() {
		return costoTelefonate;
	}
	
	public int getNumTelefonate() {
		return numTelefonate;
		
	}
	
	
	
}
