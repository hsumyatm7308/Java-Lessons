package multiplication;
import java.util.Scanner;
public class exercise15 {
//	static boolean leapyear(int year) {
//		boolean flag = false;
//		if(year % 100 == 0 && year % 400 == 0) {
//			flag = true;
//		}else if(year % 100 == 0) {
//			flag = false;
//		}else if (year % 4 == 0) {
//			flag = true;
//		}
//		return flag;
//	}
	
//	with sensei 
	static boolean leapyear(int y) {
		if((y%4 == 0 && y %100 != 0) || y %400==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = Integer.parseInt(sc.nextLine());
		if(leapyear(year)) {
			System.out.println("This is leap year");
		}else {
			System.out.println("This is not leap year");
		}

	}

}
