
public class Veicolo {

	protected int velocità;
	protected int accelerazione;
	
	public Veicolo() {
		this.velocità = 0;
		this.accelerazione = 0;
	}
	
	
	public double getVelocità() {
		return velocità;
		
	}
	
	public void setVelocità(int velocità) {
		this.velocità = velocità;
	}
	
	public double getAccelerazione() {
		return accelerazione;
	}
	
	public void setAccelerazione(int accelerazione) {
		this.accelerazione = accelerazione;
	}
	
	public void mostraParam() {
		System.out.println("l'auto sta andando a " + velocità + " km/h, accelerando a " + accelerazione + " m/s.");
	}
	
}
