
import java.util.Date;

public class Laureato {

	protected String nome;
	protected String cognome;
	protected Date dataDiNascita;
	protected String codiceFiscale;
	
	public Laureato(String nome, String cognome,
			Date data, String codFis) {
		
		this.nome = nome;
		this.cognome = cognome;
		dataDiNascita = data;
		codiceFiscale = codFis;
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
	public Date getData() {
		return dataDiNascita;
	}
	
	public void setData(Date data) {
		this.dataDiNascita = data;
	}
	public String getCf() {
		return codiceFiscale;
	}
	
	public void setCf(String codFis) {
		this.codiceFiscale = codFis;
	}
	
	
	
}
