
public class Distributore {

	//attributi
	private double deposito; //di benzina
	private double euroPerLitro;
	private double incasso;
	
	//costruttore
	public Distributore(double prezzoPerLitro) {
		this.deposito = 0;
		this.euroPerLitro = prezzoPerLitro;
		incasso = 0;
	}
	
	//metodi
	public void rifornisci(double quantità) {
		//rifornisce il deposito
		deposito = deposito + quantità;
	}
	
	public void vendi(double euro) {
		//vende benzina in base all'importo in euro pagato
		deposito = deposito - (euro / euroPerLitro);
		incasso = incasso + euro;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void setDeposito (double deposito) {
		this.deposito = deposito;
	}
	
	public double getEuroPerLitro() {
		return euroPerLitro;
	}
	
	public void setEuroPerLitro (double euroPerLitro) {
		this.euroPerLitro = euroPerLitro;
	}
	
	public void getDati() {
		System.out.println("Nel deposito ci sono: " + deposito + " litri di benzina,");
		System.out.println("al costo di: " + euroPerLitro + " €/litro.");
		System.out.println("L'incasso è di: " + incasso + " €.");

	}
	
	
	
	
	
	
	
	
	
	
	
}
