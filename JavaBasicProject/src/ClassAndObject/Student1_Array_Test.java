package ClassAndObject;

import java.util.Scanner;
public class Student1_Array_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s[] = new Student1[3];// user defined data type
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < s.length; i++) {
			System.out.println("Enter id");
			String id = sc.nextLine();
			System.out.println("Enter name");
			String name = sc.nextLine();
			System.out.println("Enter age");
			int age = Integer.parseInt(sc.nextLine());
			
			s[i] = new Student1(name,age,id);
		}
		
		for(int i = 0; i < s.length; i++) {
			s[i].displayInfo();
		}

	}

}
