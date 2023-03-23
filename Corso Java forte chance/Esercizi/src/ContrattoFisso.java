
public class ContrattoFisso extends ContrattoTelefonico {
	
	//attributi
	private String indirizzo;
	
	//costruttore
	public ContrattoFisso (String nome, String numeroTel, String indirizzo) {
		super(nome, numeroTel);
		this.indirizzo = indirizzo;
	}
	
	//metodi
	public String datiUtenza() {
		return super.datiUtenza() + "Indirizzo: " + indirizzo;
		
	}
	
	
	
	
}
