
public class Main {

	public static void main(String[] args) {

		
	
	ContrattoMobile cMobile = new ContrattoMobile("Matteo", "345 9649399");
	
	ContrattoFisso cFisso = new ContrattoFisso("Marco", "011 2056184", "Via Fleming");

	int durataMax = 300;
	
	for (int i = 0; i < 10; i++) {
		cMobile.aggiornaBolletta((int)Math.floor(Math.random() * durataMax));
		cFisso.aggiornaBolletta((int)Math.floor(Math.random() * durataMax));
	}
	
	
	System.out.println(cMobile.datiUtenza());
	System.out.println(cFisso.datiUtenza());

	
	
	
	
	

	
		
		

	}

}
