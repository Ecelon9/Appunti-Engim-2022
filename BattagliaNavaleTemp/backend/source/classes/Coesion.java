package classes;

public interface Coesion {

    /**
     * Cicla all'interno di health e cambia stato alla posizione in base a location
     * ovvero a dove è stata colpita.
     * Poi richiama isFloating.
     * 
     * @param location posizione nell'array colpita
     */
    public void hullHit(int location);

    /**
     * Verifica se la nave stia ancora galleggiando oppure se è stata affondata del
     * tutto.
     * Se tutte le posizioni di health sono false, allora setta isSank a true,
     * che setta floating a false, quindi la nave è affondata
     * 
     * @return boolean, lo stato della nave
     */
    public boolean isFloating();

    /**
     * Scrive nel terminale lo stato di ogni singolo pezzo di scafo e lo stato della nave.
     */
    public void getStatus();

}
