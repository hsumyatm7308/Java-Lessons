package DBConnection;

import java.sql.*;
import java.util.Iterator;

public class SelectData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ConnectDB obj = new ConnectDB();
			Connection conresult = obj.connect();

			Statement stmt;
			ResultSet rs;
			stmt = conresult.createStatement();
			rs = stmt.executeQuery("SELECT * FROM student WHERE studentnumber = 6724");
			
			System.out.println("Student Number"+"\t\t" + "Student Name"  + "\t\t" + "Gender");

			while(rs.next()) {
				String sno = rs.getString(1);
				String sname = rs.getString(2);
				String gender = rs.getString(3);
				
//			
//				Iterator it = rs.iterator();
//				while(it.hasNext()) {
//					System.out.println(it.next());
//				}
				
//				System.out.println(sno+"\t\t\t" + sname  + "\t\t" + gender);
			}
			
			rs.close();
			stmt.close();
			obj.disconnect();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
