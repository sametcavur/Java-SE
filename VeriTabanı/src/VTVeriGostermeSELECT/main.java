package VTVeriGostermeSELECT;
import java.sql.*;
public class main {
	public static void main(String[] args) throws SQLException {	
		Connection connection = null;
		Statement statement = null;
		ResultSet  resultset;
		dbHelper db = new dbHelper();
		try {
			connection = db.getConnection();
			System.out.println("SQL Connection is succesfully");
			statement = connection.createStatement();
			resultset=statement.executeQuery("SELECT CountryCode,Language FROM countrylanguage");
			while(resultset.next()) {
				System.out.print(resultset.getString("CountryCode"));
				System.out.print("///");
				System.out.println(resultset.getString("Language"));
			}
		} catch (SQLException e) {
			System.out.println("SQL Connection is not succesfully");
			db.showErrorMessages(e);
		}
		finally {
			db.connectionClose(connection);
			System.out.println("Baðlantý kapatýldý.");
		}
	}

}
