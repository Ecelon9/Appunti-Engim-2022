
public class Automobile extends Veicolo {

	protected boolean avviata;
	
	protected void avvia(int metrisec ,int kmh) {
		this.avviata = true;
		this.accelerazione = metrisec;
		this.velocità = kmh;
	}
	
		
}
