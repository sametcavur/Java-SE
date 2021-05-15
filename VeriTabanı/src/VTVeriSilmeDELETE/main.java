package VTVeriSilmeDELETE;
import java.sql.*;
public class main {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		dbHelper db = new dbHelper();
		try {
			connection = db.getConnection();
			System.out.println("Baðlantý Baþarýlý");
			String silinenVeri = "Delete from city where ID='4086'";
			statement = connection.prepareStatement(silinenVeri);
			statement.execute();
		} catch (SQLException e) {
			db.showErrorMessages(e);
		}
		finally {
			connection.close();
			statement.close();
			System.out.println("SQL Kapatýldý");
		}		}       }
