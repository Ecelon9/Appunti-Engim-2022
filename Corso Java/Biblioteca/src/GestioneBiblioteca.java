import java.util.ArrayList;

public interface GestioneBiblioteca {
	
	  public boolean add(Libro libro);

	  public boolean contiene(Libro libro);

	  public ArrayList<Libro> getLibri();

	  public Libro cerca(String autore, String titolo);
	  
	  public Libro cerca(String titolo);
	  	  
	  public boolean remove(String titolo);
}
