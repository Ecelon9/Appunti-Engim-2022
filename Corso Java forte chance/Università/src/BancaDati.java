
import java.util.LinkedList;

public class BancaDati {
	
	protected LinkedList<Laureato> listaLaureati;
	protected LinkedList<Relatore> listaRelatori;
	protected LinkedList<CorsoLaurea> listaCorsi;
	protected LinkedList<Laurea> listaLauree;
	
					//
	
	@SuppressWarnings("deprecation")
	public int numeroLaureati(int anno, String denom) {
		
		int totaleLaureati = 0;
		int codiceCorso = -1;
		
		for(CorsoLaurea corso : listaCorsi) {
			
			if(corso.getDenom().equals(denom)) {
				codiceCorso = corso.getCodiceCorso();
			}	
		}
		
		for(Laurea laurea : listaLauree) {
			
			if(laurea.getCodiceCorso() == codiceCorso &&
				laurea.getData().getYear() == anno) {
				totaleLaureati++;
			}
		}
		
		return totaleLaureati;
		
	}
	
	public LinkedList<String> tesiRelatori (String cognome) {
		
		LinkedList<Integer> codiceRelatore = new LinkedList<Integer>();
		
		for(Relatore relatore : listaRelatori) {
			if(relatore.getCognome().equals(cognome)) {
				codiceRelatore.add(relatore.getCodiceRelatore());
			}
		}
		
		LinkedList<String> tesi = new LinkedList<String>();
		
		for(Laurea laurea : listaLauree) {
			if(laurea.getListaRelatori().equals(codiceRelatore)) {
				tesi.add(laurea.getTitoloTesi());
			}
		}
		return tesi;
	}
	
	public LinkedList<Relatore> correlatoriEsterni (String facoltà) {
		
		LinkedList<Integer> relatoriInterni = new LinkedList<Integer>();
		
		for(Relatore relatore : listaRelatori) {
			if(relatore.getFacoltà().equals(facoltà)) {
				relatoriInterni.add(relatore.getCodiceRelatore());
			} 
		}
		
		LinkedList<Integer> relatoriEsterni = new LinkedList<Integer>();
		
		for(Relatore relatore : listaRelatori) {
			if(relatore.getFacoltà() == null) {
				relatoriEsterni.add(relatore.getCodiceRelatore());
			} 
		}
		
		LinkedList<Relatore> laurea = new LinkedList<Relatore>();
		/**
		 * Scorro nelle liste di lauree(tesi) in cerca dei codici del Relatori,
		 * scorro nell'elenco dei Relatori Interni,
		 * se il codice di un Relatore Interno e di un Relatore Esterno
		 * sono presenti, li aggiungo alla lista Laurea. 
		 */
		for(Laurea tesi : listaLauree) {
			for(Integer codiceInterno : relatoriInterni) {
				if(tesi.getListaRelatori().contains(codiceInterno) 
					&& tesi.getListaRelatori().containsAll(relatoriEsterni)) {
					laurea.add(trovaRel(codiceInterno));
				}
			}
		}		
	}
	
	public Relatore trovaRel(int codice) {
		
		for(Relatore rel : listaRelatori) {
			if(rel.getCodiceRelatore() == codice) {
				return rel;
			}
		}
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
