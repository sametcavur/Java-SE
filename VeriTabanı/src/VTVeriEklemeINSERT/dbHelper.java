package VTVeriEklemeINSERT;

import java.sql.*;

public class dbHelper {
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
	}
	public void showError(SQLException e) {
		System.out.println("Hata Mesajý = " +e.getMessage());
		System.out.println("Hata Kodu = " +e.getErrorCode());
	}
	public void connectionClose(Connection e) throws SQLException {
		e.close();
	}

}
