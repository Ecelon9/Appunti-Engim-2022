/**
 * Questo test ha lo scopo di verifica il corretto funzionamento del polimofrismo
 */
package tests;

import utils.Alce;
import utils.Cane;
import utils.Gatto;
import utils.Mucca;
import utils.Gallina;

public class Tests01 {
	public static void main(String[] args) {
		Alce alce = new Alce("Rudolf", 400.0);
		Cane cane = new Cane("Tobia", 35.0);
		Gatto gatto = new Gatto("Fuffi", 6.0);
		Mucca mucca = new Mucca("Milk", 1000.0);
		Gallina gallina = new Gallina("Pollo", 1.5);
		
		alce.emetteVerso();		
		cane.emetteVerso();
		gatto.emetteVerso();		
		mucca.emetteVerso();	
		gallina.emetteVerso();
		
	}
}
