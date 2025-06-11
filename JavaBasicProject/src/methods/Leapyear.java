package methods;
import java.util.Scanner;
public class Leapyear {
	static boolean isLeapYear(int n) {
		boolean flag = false;
		if(n % 100 == 0 ) {
			flag = false;
		}else if(n % 4 == 0) {
			flag = false;
		}
		
		return flag;  
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(sc.nextLine());
		boolean result = isLeapYear(num);
		if(result) {
			System.out.println(num + " This is leap year");
		}else {
			System.out.println( num + " This is not leap year");
		}

	}

}
