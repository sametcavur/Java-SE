package VTVeriGunc.UPDATE;
import java.sql.*;
public class main {
	public static void main(String[] args) throws SQLException {	
		Connection connection = null;
		PreparedStatement statement = null;
		dbHelper db = new dbHelper();
		try {
			connection = db.getConnection();
			System.out.println("SQL Connection is succesfully");
			String sql = "update city set Name=? where ID=4084";
			statement = connection.prepareStatement(sql);
			statement.setString(1, "Man");
			statement.executeUpdate();
			System.out.println("Kayýt Güncellendi.");
			}
			catch (SQLException e) {
			System.out.println("SQL Connection is not succesfully");
			db.showErrorMessages(e);
			}
			finally {
				statement.close();
				connection.close();
			} 
		}
	}
