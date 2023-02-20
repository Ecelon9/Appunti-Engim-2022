/**
 * Questo test ha lo scopo di verificare il corretto funzionamento della classe Fattoria
 */
package tests;

import utils.Alce;
import utils.Cane;
import utils.Fattoria;
import utils.Gatto;
import utils.Mucca;
import utils.Gallina;

public class Tests02 {
	public static void main(String[] args) {
		Alce alce = new Alce("Rudolf", 400.0);
		Cane cane = new Cane("Tobia", 35.0);
		Gatto gatto = new Gatto("Fuffi", 6.0);
		Mucca mucca = new Mucca("Milk", 1000.0);
		Gallina gallina = new Gallina("Pollo", 1.5);
		Fattoria fattoria = new Fattoria();
		
		fattoria.aggiungiAnimale(mucca);
		fattoria.aggiungiAnimale(gatto);
		fattoria.aggiungiAnimale(cane);
		fattoria.aggiungiAnimale(alce);
		fattoria.aggiungiAnimale(gallina);
		fattoria.mostraAnimali();
	}
}
