
import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception{
		
		Class.forName("org.h2.Driver");
		Connection conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = conn.createStatement();
		
		String crea = "Create table Persone (Nome varchar(20), Cognome varchar(20), id int primary key)";
		stmt.executeUpdate(crea);
		
		
		String selectQuery = "SELECT * FROM Persone";
		ResultSet rs = stmt.executeQuery(selectQuery);
		
	//	String updateSql = "UPDATE TEST SET ID = 10, NAME = 'Antonio' WHERE (ID = 3)";
	//	ResultSet rs = stmt.executeQuery(selectQuery);
		
		
		String parametricSelect = "SELECT * FROM Persone WHERE COGNOME = ? ";
		PreparedStatement ps = conn.prepareStatement(parametricSelect);
		ps.setString(1, "Verdi"); // il numero indica quale ? usare come riferimento - ce ne fossero di più è possibile saltare quelli prima e andare direttamente a quella desiderata.
		ps.executeQuery();
		
		
		while (rs.next()) {
			int id = rs.getInt("id");
			String nome = rs.getString("nome");
			String cognome = rs.getString("congome");
			System.out.print("ID: " + id);
			System.out.print(", NOME: " + nome);
			System.out.println(", CONGOME: " + cognome);
		}
		
		rs.close();
		stmt.close();
		conn.close();
		
	}

	
	
	
	
	
	
	
}
