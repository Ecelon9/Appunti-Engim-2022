import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Database implements GestioneFile {
	
	private RandomAccessFile db;
	
	public Database(){
		db=null;
	}
	
	@Override
	public void openFile() {
		try {
			db = new RandomAccessFile("biblioteca.txt","rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object loadObject() {
		try {
			String titolo = db.readUTF();
			String autore = db.readUTF();
			return new Libro(autore,titolo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
		}
		return null;
	}

	@Override
	public boolean writeObject(Object obj) {
		Libro l =(Libro) obj;
		try {
			db.writeUTF(l.getTitolo());
			db.writeUTF(l.getAutore());
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public void closeFile() {
		try {
			db.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public long size() {
		try {
			return db.length();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

}
