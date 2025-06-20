package DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {
	static Scanner scan = new Scanner(System.in);
	

	public static void main(String[] args) {

		
		try {
			ConnectDB obj = new ConnectDB();
			Connection conn = obj.connect();
			
//			stno 
//			sbject n0 
//			id 
			
			System.out.println("Enter Student Number: ");
			String sno = scan.nextLine();
			
			System.out.println("Enter Subject Number : ");
			String subno = scan.nextLine();
			
			System.out.println("Enter Score");
			int score = scan.nextInt();
			
			String sql = "UPDATE score SET score= ?  WHERE studentnumber = ? AND subjectnumber = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,score);
			pstmt.setString(2,sno);
			pstmt.setString(3,subno);
			int row = pstmt.executeUpdate();
			
			if(row > 0 ) {
				System.out.println("Update Successfully " + row + " effected");
				
			}else {
				System.out.println("No matching record found");
			}
			
			pstmt.close();
			
			
			
			
			obj.disconnect();
			
		}catch(Exception e) {
			
		}

	}

}
