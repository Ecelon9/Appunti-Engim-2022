
public class ContrattoMobile extends ContrattoTelefonico {

	//attributi
	private static final double ScattoRisposta = 5.10;

	//costruttore
	public ContrattoMobile(String nome, String numeroTel) {
		super(nome, numeroTel);
		
	}
	
	
	
	//metodi
	public void aggiornaBolletta(int nSecondi) {
		if (nSecondi > 0) {
		super.aggiornaBolletta(nSecondi);
		super.aggiungiCosti(ScattoRisposta);
		}
	}
	
		
	
}
