
import java.util.Date;
import java.util.LinkedList;

public class Laurea {

	protected String codFiscLaureato;
	protected int codiceCorso;
	protected int valutazione;
	protected boolean lode;
	protected Date dataSeduta;
	protected String denominazione;
	protected LinkedList<Integer> listaRelatori;
	
	public Laurea(String codFiscLaureato, int codiceCorso,
					int valutazione, boolean lode, 
					Date dataSeduta, String titoloTesi,
					LinkedList<Relatore> codiciRelatori) {
		
		this.codFiscLaureato = codFiscLaureato;
		this.codiceCorso = codiceCorso;
		this.valutazione = valutazione;
		this.lode = lode;
		this.dataSeduta = dataSeduta;
		this.denominazione = titoloTesi;
		this.listaRelatori = getCodiceRel(codiciRelatori);
		
	}
	/**
	 * 
	 * @param codiciRel
	 * @return
	 */
	public LinkedList<Integer> getCodiceRel(LinkedList<Relatore> codiciRel) {
		
		LinkedList<Integer> codRel = new LinkedList<Integer>();
		
		for(Relatore codice : codiciRel) {
			codRel.add(codice.getCodiceRelatore());
		}
		
		return codRel;
	}
	
	public String getCFLaur() {
		return codFiscLaureato;
	}
	
	public void setCFLaur(String codFiscLaureato) {
		this.codFiscLaureato = codFiscLaureato;

	}
	
	public int getCodiceCorso() {
		return codiceCorso;
	}
	
	public void setCodiceCorso(int codiceCorso) {
		this.codiceCorso = codiceCorso;

	}
	
	public int getValutazione() {
		return valutazione;
	}
	
	public void setValutazione(int valutazione) {
		this.valutazione = valutazione;

	}
	
	public boolean getLode() {
		return lode;
	}
	
	public void setLode(boolean lode) {
		this.lode = lode;

	}
	
	public Date getData() {
		return dataSeduta;
	}
	
	public void setData(Date dataSeduta) {
		this.dataSeduta = dataSeduta;

	}
	
	public String getTitoloTesi() {
		return denominazione;
	}
	
	public void setTitoloTesi(String titoloTesi) {
		this.denominazione = titoloTesi;

	}
	
	public LinkedList<Integer> getListaRelatori() {
		return listaRelatori;
	}
	
	public void setListaRelatore(int codiceRelatore) {
		this.listaRelatori.add(codiceRelatore);
	}
	
	
}
