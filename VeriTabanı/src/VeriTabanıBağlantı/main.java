package VeriTaban�Ba�lant�;
import java.sql.*;
public class main {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		dbHelper dbHelper = new dbHelper();
		try {
			connection = dbHelper.getConnection();
			System.err.println("SQL Ba�lant�s� Olu�tu");
			}
		 
		catch (SQLException e) {
			dbHelper.showErrorMessage(e);
		}
		finally {
			connection.close();
		}
	}
	}
