import java.util.ArrayList;

public class Biblioteca implements GestioneBiblioteca{

	private ArrayList<Libro> lista;
	
	public Biblioteca(){
		lista = new ArrayList<Libro>();
	}
	@Override
	public boolean add(Libro libro) {
		if(!this.contiene(libro)){
			lista.add(libro);
			return true;
		}else{
			return true;
		}
	}

	@Override
	public boolean contiene(Libro libro) {
		if(lista.contains(libro)){
			return true;
		}
		return false;
	}

	@Override
	public ArrayList<Libro> getLibri() {
		return lista;
	}

	@Override
	public Libro cerca(String autore, String titolo) {
		for(Libro tmpL:lista){
			if(tmpL.getAutore().equalsIgnoreCase(autore) && tmpL.getTitolo().equalsIgnoreCase(titolo)){
				return tmpL;
			}
		}
		return null;
	}
	
	public Libro cerca(String titolo) {
		for(Libro tmpL:lista){
			if(tmpL.getTitolo().equalsIgnoreCase(titolo)){
				return tmpL;
			}
		}
		return null;
	}

	@Override
	public boolean remove(String titolo) {
		Libro tmpLibro = this.cerca(titolo);
		if(tmpLibro!=null){
			lista.remove(tmpLibro);
			return true;
		}
		return false;
	}

}
