
import java.util.Random;

public class Relatore {

	protected String nome;
	protected String cognome;
	protected int codiceRelatore;
	protected String facoltà;
	
	public Relatore(String nome, String cognome, 
					String facoltà) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.codiceRelatore = new Random().nextInt();
		this.facoltà = facoltà;
		
	}
			
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
	
	public int getCodiceRelatore() {
		return codiceRelatore;
	}
	
	public String getFacoltà() {
		return facoltà;
	}
	
	public void setFacoltà(String facoltà) {
		this.facoltà = facoltà;
	}
	
	
	
}
