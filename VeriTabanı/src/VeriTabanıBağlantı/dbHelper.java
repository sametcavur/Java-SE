package VeriTabanýBaðlantý;
import java.sql.*;
public class dbHelper {
	public Connection getConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","1234");
	}
	public void showErrorMessage(SQLException e) {
		System.out.println("SQL Hatasý:"+ e.getLocalizedMessage());
		System.out.println("Hata Kodu:"+ e.getErrorCode());
	}}

