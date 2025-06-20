package Collection_Exercise;

import java.util.Scanner;
import java.util.ArrayList;
public class Producce_Management {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Product> plist = new ArrayList();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("..Product Management System...");
		System.out.println("1. Add New Product");
		System.out.println("2. Display All Product");
		System.out.println("3. Display Products that greater than amount");
		System.out.println("4. Search Product By ID");
		System.out.println("5. Exit System");

		String choice = "yes";
		while (choice.equals("yes")) {
			
			
			System.out.println("Enter menu");
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1:
				System.out.println("Add New Product");
				addProduct();
			break;
			case 2:
				System.out.println("Display All Product");
				displayAll();
			break;
			case 3:
				System.out.println("Display Products that greater than amount");
				DisplayProductGreaterThanAmount();
			break;
			case 4:
				System.out.println("Search Product By ID");
				SearchProduct();
			break;
			case 5:
				System.out.println("Exit System");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Menu");
				
			}
			
			System.out.println("Do another (yes/no?)");
			choice = sc.nextLine();
		}

	}
	
	public static void addProduct() {
		System.out.println("Enter ID:");
		int pid = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Price");
		double price = Double.parseDouble(sc.nextLine());
		Product p = new Product(pid,name,price);
		plist.add(p);
	}

	public static void displayAll() {
		for(Product p : plist) {
			System.out.println(p.toString());
		}
	}
	
	public static void DisplayProductGreaterThanAmount() {
		System.out.println("Enter Amount");
		double amt = Double.parseDouble(sc.nextLine());
		for(Product p : plist) {
			if(amt <= p.getPrice()  ) {
				System.out.println(p.toString());
			}
		}
	}
	
	public static void SearchProduct() {
		int product =Integer.parseInt(sc.nextLine());
		boolean flag = false;

		for(Product p : plist) {
			if(product == p.getPid()){
				flag = true;
				System.out.println("Found");
				System.out.println(p.toString());
			}
		}
		if(!flag) {
			System.out.println("Not Found");
		}
	}
}
