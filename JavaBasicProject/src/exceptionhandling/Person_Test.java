package exceptionhandling;
import java.util.Scanner;
public class Person_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String n = sc.nextLine();
		System.out.println("Enter age");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Email: ");
		String e = sc.nextLine();
		
		
		Person p = new Person(n,a,e);
	
		
		try {
			p.registerUser(n,a);
		}catch(InvalidAgeException ae) {
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		catch(EmptyNameException ne) {
			System.out.println(ne.getMessage());
		}

	}

}
