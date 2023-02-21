import java.io.EOFException;
import java.util.ArrayList;
import java.util.Scanner;

public class AvvioBibliotecaDB {

	public static void main(String[] args) {

		char scelta = ' ';
		Libro libro = null;
		Biblioteca bio = new Biblioteca();
		Scanner in = new Scanner(System.in);
		String autore, titolo;

		// Carioco da File
		Database db = new Database();
		db.openFile();
		//try {
			if(db.size()>0)
				while (true) {
					Libro book = (Libro) db.loadObject();
					if(book!=null)
						bio.add(book);
					else
						break;
				}
			db.closeFile();
		/*} catch (EOFException ex) {
			System.out.println("End of file reached!");
			
		}*/

		while (scelta != 'q') {
			System.out.println("Inserisci scelta");
			System.out.println(
					"[a:inserici Libro|b:cerca per titolo|c:cerca per titolo e autore|r:rimuovi libro|l:lista libri]");
			scelta = in.nextLine().charAt(0);
			switch (scelta) {
			case 'a':
				System.out.print("Inserisci autore:");
				autore = in.nextLine();
				System.out.println();
				System.out.print("Inserisci titolo:");
				titolo = in.nextLine();
				libro = new Libro(autore, titolo);
				bio.add(libro);
				break;
			case 'b':
				System.out.print("Inserisci titolo:");
				titolo = in.nextLine();
				libro = bio.cerca(titolo);
				if (libro != null) {
					System.out.println("libro trovato: " + libro.getAutore() + " " + libro.getTitolo());
				} else {
					System.out.println("libro non presente in catalogo");
				}
				break;
			case 'c':
				System.out.print("Inserisci autore:");
				autore = in.nextLine();
				System.out.println();
				System.out.print("Inserisci titolo:");
				titolo = in.nextLine();
				libro = bio.cerca(autore, titolo);
				if (libro != null) {
					System.out.println("libro cercato: " + libro);
				} else {
					System.out.println("libro non presente in catalogo");
				}
				break;
			case 'r':
				System.out.print("Inserisci titolo:");
				titolo = in.nextLine();
				if (bio.remove(titolo)) {
					System.out.println("libro " + titolo + " rimosso con successo ");
				} else {
					System.out.println("libro non presente in catalogo");
				}
				break;
			case 'l':
				ArrayList<Libro> listaTot = bio.getLibri();
				System.out.println("libri totali in libreria: " + listaTot.size());
				for (Libro l : listaTot) {
					System.out.println(l);
				}
				break;
			}
		}
			in.close();
			//Scrivo nel file
			db.openFile();
			int count=0;
			ArrayList<Libro> lista = bio.getLibri();
			while (count < lista.size()) {
				db.writeObject(lista.get(count));
				count++;
			}
			db.closeFile();
	}

}
