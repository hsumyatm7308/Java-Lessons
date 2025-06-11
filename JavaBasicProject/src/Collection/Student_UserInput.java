package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList slist = new ArrayList();
		Scanner sc = new Scanner(System.in);
		String choice = "yes";
		while (choice.equals("yes")) {

			System.out.println("Enter id: ");
			int id = Integer.parseInt(sc.nextLine());
			System.out.println("Enter name:");
			String name = sc.nextLine();
			System.out.println("Enter Roll no:");
			int rno = Integer.parseInt(sc.nextLine());
			System.out.println("Enter mark:");
			int mark = Integer.parseInt(sc.nextLine());
			System.out.println("Enter email:");
			String email = sc.nextLine();

			Student s = new Student(id, name, rno, mark, email);

			slist.add(s);
			System.out.println("Do another (yes/no)?");
			choice = sc.nextLine();
		}
		
		for(int i = 0; i < slist.size();i++) {
			System.out.println(slist.get(i).toString());
		}
	}

}
