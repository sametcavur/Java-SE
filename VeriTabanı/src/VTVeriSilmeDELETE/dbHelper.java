package VTVeriSilmeDELETE;
import java.sql.*;

public class dbHelper {
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
	}
	public void showErrorMessages(SQLException e) {
		System.out.println("Hata Mesajý="+e.getMessage());
		System.out.println("Hata Kodu="+e.getErrorCode());
	}
}
