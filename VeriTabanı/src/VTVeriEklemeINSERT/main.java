package VTVeriEklemeINSERT;

import java.sql.*;

public class main {
	public static void main(String[] args) throws SQLException {
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	dbHelper db = new dbHelper();
	try {
		connection = db.getConnection();
		System.out.println("Baðlantý Baþarýlý");
		String sorgu = "INSERT INTO city(ID,Name,CountryCode,District,Population) values(?,?,?,?,?)";
		preparedStatement = connection.prepareStatement(sorgu);
		preparedStatement.setInt(1, 4085);
		preparedStatement.setString(2, "SametCity");
		preparedStatement.setString(3, "TUR");
		preparedStatement.setString(4, "Sametland");
		preparedStatement.setInt(5, 1);
		preparedStatement.executeUpdate();
		System.out.println("Veri ekleme baþarýlý");
	} catch (SQLException e) {
		db.showError(e);
	}
	finally {
		db.connectionClose(connection);
	}}}
