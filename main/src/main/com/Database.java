package main.com;
import java.sql.*;
public class Database {

	private String url="jdbc:mysql://localhost:3306/survey";
	private String Username = "root";
	private String pass = "";
	private String  query = "INSERT INTO data ( Name, Father_Name, Mother_Name, qualification, Number) VALUES ( ?, ?, ?, ?, ?)";
	
	public void insertData(String name, String fname, String mname, String qualification, long num) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,Username,pass);
		
		PreparedStatement ps = con.prepareStatement(query);
	
		ps.setString(1, name);
		ps.setString(2, fname);
		ps.setString(3, mname);
		ps.setString(4, qualification);
		ps.setLong(5, num);
		
		ps.executeUpdate();
		
		System.out.println("Successfully Data  Stored !!");
		
	}
}
