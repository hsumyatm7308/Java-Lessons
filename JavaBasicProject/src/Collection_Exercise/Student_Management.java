package Collection_Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_Management {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> slist = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("...Student Management System...");
		System.out.println("1. Add New Student");
		System.out.println("2. Display All Students");
		System.out.println("3. Search Student By RollNo");
		System.out.println("4. Remove Student By RollNo");
		System.out.println("5. Display Student' who get highest Marks");
		System.out.println("6. Exit System");

		String choice = "yes";
		while (choice.equals("yes")) {
			System.out.println("Enter menu:");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("Adding New Student");
				addStudent();
				break;
			case 2:
				System.out.println("Display All Student");
				displayAll();
				break;
			case 3:
				System.out.println("Search Student By RollNo");
				Search();
				break;
			case 4:
				System.out.println("Remove Student By RollNo");
				delete();
				break;
			case 5:
				System.out.println("Display Student who get hightest Marks");
				displayHighest();
				break;
			case 6:
				System.out.println("Exit System");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Menu");

			}

			
			System.out.println("Do Another (yes/no)");
			choice = sc.nextLine();
		}




	}

	public static void addStudent() {
		System.out.println("Enter RollNo:");
		int rno = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Marks");
		int marks = Integer.parseInt(sc.nextLine());
		Student s = new Student(rno, name, marks);
		slist.add(s);
	}

	public static void displayAll() {
		for (Student s : slist) {
			System.out.println(s.toString());
		}

	}

	public static void Search() {
		System.out.println("Enter search rooll no:");
		int srno = Integer.parseInt(sc.nextLine());
		boolean flag = false;
		for (Student s : slist) {
			{
				if (srno == s.getRollno()) {
					flag = true;
					System.out.println("Found");
					System.out.println(s.toString());
				}
			}

		}

		if (!flag) {
			System.out.println("Not Found");
		}

	}

	public static void delete() {
		System.out.println("Enter remove Roll No:");
		int rno = Integer.parseInt(sc.nextLine());
		boolean result = false;
		for (Student s : slist) {
			if (rno == s.getRollno()) {
				result = slist.remove(s);
				break;
			}
		}

		if (!result) {
			System.out.println("Student not exist.");
		}
	}

	public static void displayHighest() {
		int max = 0;
		Student ss = new Student();
		for (Student s : slist) {
			if (max < s.getMarks()) {
				max = s.getMarks();
				ss = s;
			}
		}

		System.out.println(ss.toString());
	}

}
