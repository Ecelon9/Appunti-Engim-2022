
public class Veicolo {

	protected int velocit�;
	protected int accelerazione;
	
	public Veicolo() {
		this.velocit� = 0;
		this.accelerazione = 0;
	}
	
	
	public double getVelocit�() {
		return velocit�;
		
	}
	
	public void setVelocit�(int velocit�) {
		this.velocit� = velocit�;
	}
	
	public double getAccelerazione() {
		return accelerazione;
	}
	
	public void setAccelerazione(int accelerazione) {
		this.accelerazione = accelerazione;
	}
	
	public void mostraParam() {
		System.out.println("l'auto sta andando a " + velocit� + " km/h, accelerando a " + accelerazione + " m/s.");
	}
	
}
