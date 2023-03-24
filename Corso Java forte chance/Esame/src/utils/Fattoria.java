/**
 * Questo classe la responsabilità di aggiungere determinati animali, all'interno di una fattoria
 *@author Giacomo
 */
package utils;

import java.util.ArrayList;

public class Fattoria {
	public static ArrayList<Animale> animales = new ArrayList<>(); 
	/**
	 * Questo metodo permette di aggiungere qualsiasi tipo di Animale all'interno della fattoria
	 * @param animale
	 */
	public void aggiungiAnimale(Animale animale){
		animales.add(animale);
	}
	/**
	 * Questo metodo mostra tutti gli animali presenti in una fattoria
	 */
	public void mostraAnimali(){
		for (int i = 0; i < Fattoria.animales.size(); i++) {
			Fattoria.animales.get(i).emetteVerso();
			Fattoria.animales.get(i).mangia();
		}
	}
}
