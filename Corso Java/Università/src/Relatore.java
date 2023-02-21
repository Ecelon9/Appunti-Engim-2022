
import java.util.Random;

public class Relatore {

	protected String nome;
	protected String cognome;
	protected int codiceRelatore;
	protected String facolt�;
	
	public Relatore(String nome, String cognome, 
					String facolt�) {
		
		this.nome = nome;
		this.cognome = cognome;
		this.codiceRelatore = new Random().nextInt();
		this.facolt� = facolt�;
		
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
	
	public String getFacolt�() {
		return facolt�;
	}
	
	public void setFacolt�(String facolt�) {
		this.facolt� = facolt�;
	}
	
	
	
}
