package garage;

import veicoli.VeicoloAMotore;

public class Garage {

	private VeicoloAMotore[] veicoli;
	
	public Garage() {
		veicoli = new VeicoloAMotore [15];
	}
	
	public int immettiNuovoVeicolo(VeicoloAMotore veicolo) {
		for (int i = 0; i < veicoli.length; i++) {
			if (veicoli[i] == null) {
			veicoli[i] = veicolo;
			return i;
			}
		}
		return -1;
	}
	
	
	public VeicoloAMotore estraiVeicolo(int posto) {
		
		VeicoloAMotore veicolo = veicoli[posto];
		veicoli[posto] = null;
		return veicolo;
		} 
	
	
	public void stampaPosti() {
		for (int i = 0; i >= veicoli.length; i++) {
			System.out.println("Posizione: " + i + veicoli[i]);
		}
	}
	
	
	
}
