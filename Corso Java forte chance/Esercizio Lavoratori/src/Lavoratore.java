
public class Lavoratore {

	//Attributi
	private String nome;
	private String cognome;
	private final double COSTO_GIORNALIERO = 25;

	//Costruttore
	public Lavoratore(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	} 
	
	
	//Metodi	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public double stipendio(int giorni) {
		return COSTO_GIORNALIERO * giorni;
	}
	
	
	
	
	
	
	
}
