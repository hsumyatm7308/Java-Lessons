package DBConnection;

import java.sql.*;

public class ConnectDB {
	final String url = "jdbc:mysql://localhost:3306/db14a";
	final String user = "root";
	final String password = "";
	Connection con;
	
	public Connection connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);
			System.out.println("Connnected to the database successfully\n");
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println("Failed to connect to the database");
			e.printStackTrace();
		}
		return con;
	}
	
	public void disconnect() {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
				System.out.println("\nDisconnected from the database");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
