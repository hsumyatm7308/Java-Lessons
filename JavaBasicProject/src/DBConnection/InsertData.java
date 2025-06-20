package DBConnection;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
	static CallableStatement cstmt;
	static Scanner scan = new Scanner(System.in);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ConnectDB obj = new ConnectDB();
			Connection conn = obj.connect();
			
			System.out.println("Enter Student Number: ");
			String sno = scan.nextLine();
			
			System.out.println("Enter Student Name : ");
			String sname = scan.nextLine();
			
			System.out.println("Enter Gender");
			String gender = scan.nextLine();
			
			cstmt = conn.prepareCall("{call insertstudent(?,?,?)}");
			cstmt.setString(1,sno);
			cstmt.setString(2, sname);
			cstmt.setString(3, gender);
			cstmt.execute();
			
			System.out.println("Save sucessfully");
			
			cstmt.close();
			obj.disconnect();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		


	}

}
