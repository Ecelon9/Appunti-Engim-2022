
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class DatabaseFile implements GestioneDB {
	
	private RandomAccessFile db; 
	
	public DatabaseFile() {
		db = null;
	}
	
	public void open() {
		try {
			db = new RandomAccessFile("biblioteca.txt", "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Object loadObject() {
		try {
			String titolo = db.readUTF();
			String autore = db.readUTF();
			return new Libro(autore, titolo);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean writeObject(Object obj) {
		Libro libro = (Libro) obj;
		try {
			db.writeUTF(libro.getTitolo());
			db.writeUTF(libro.getAutore());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public long size() {
		try {
			return db.length();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return -1;
	}
	
	public void close() {
		try {
			db.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
