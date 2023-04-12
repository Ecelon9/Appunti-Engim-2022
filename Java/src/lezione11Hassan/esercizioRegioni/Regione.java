package esercizioRegioni;

import java.util.*;

/**
 * Realizzare un hasmap di regioni, contenenti nomi di città come chiave e lista di nomi di province come valore
 */
public class Regione {

    HashMap<String,List<String>> elencoProvince = new HashMap<>();

    public Regione() {}

    public HashMap<String, List<String>> getElencoProvince() {
        return elencoProvince;
    }

    public void setElencoProvince(String nomeCitta, List<String> elencoComuni) {
        this.elencoProvince.put(nomeCitta, elencoComuni);
    }

    public List<String> getElencoProvincePerCitta(String nomeCitta) {
        return elencoProvince.get(nomeCitta);
    }
    
    public static void main(String[] args) {


        HashMap<String, HashMap<String, List<String>>> elencoRegioni = new HashMap<>();
        Regione piemonte = new Regione();
        Regione lombardia = new Regione();

        piemonte.setElencoProvince("torino", new ArrayList<String>(Arrays.asList("moncalieri", "nichelino", "beinasco")));
        lombardia.setElencoProvince("milano", new ArrayList<String>(Arrays.asList("sergate", "pioltello", "bollate")));
        
        //System.out.println(piemonte.getElencoProvincePerCitta("torino"));
        //System.out.println(lombardia.getElencoProvincePerCitta("milano"));

        elencoRegioni.put("piemonte", piemonte.getElencoProvince());
        elencoRegioni.put("lombardia", lombardia.getElencoProvince());

        for (String string : piemonte.get("piemonte")) {
            
        }

    }
    
}
