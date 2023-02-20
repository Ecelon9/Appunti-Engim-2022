
import java.sql.*;

public class Sql implements GestioneDB {
	
	private Connection conn;
	private ResultSet rs;
	private Statement stmt;
	
	public Sql () {
		this.conn = null;
		this.rs = null;
		this.stmt = null;
	}
	
	public void open() throws Exception {
		
		Class.forName("org.h2.Driver");
		conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		stmt = conn.createStatement();
		
		String crea = "CREATE TABLE Biblioteca (Titolo varchar(20), Autore varchar(20), id int primary key)";
		stmt.executeUpdate(crea);
		
	}

	public Object loadObject() throws Exception {
		
		int id = 1;
		
		String comando = "SELECT titolo, autore FROM Biblioteca WHERE ID = " + id;
		rs = stmt.executeQuery(comando);	
		rs.next();
		
		String getTitolo = rs.getString("titolo");
		String getAutore = rs.getString("autore");
		
		id++;
		
		return new Libro(getTitolo, getAutore);
	}

	public boolean writeObject(Object obj) throws Exception {
		
		int id = 1;
		Libro libro = (Libro) obj;
		
		String comando = "INSERT INTO Biblioteca (" + libro.getTitolo() + ", "
				+ libro.getAutore() + ", " + id + ")";
		rs = stmt.executeQuery(comando);
		id++;
			
		return false;

	}

	public long size() throws Exception {
		String comando = "SELECT COUNT(*) AS total FROM BIBLIOTECA";
		rs = stmt.executeQuery(comando);
		rs.next();
		
		int tot = rs.getInt("total");
		return tot;
		
	}

	public void close() throws Exception{ 
		rs.close();
		stmt.close();
		conn.close();
		
	}
	
	
	
}
