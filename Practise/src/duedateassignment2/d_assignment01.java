package duedateassignment2;
import java.util.Scanner;

public class d_assignment01 {
	static boolean perfectSquare(int num) {
		boolean flag = false;
		for(int i = 0; i < num; i++) {
			if(i * i == num) {
				flag = true;
			}
		}
		
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int num = Integer.parseInt(sc.nextLine());
		if(perfectSquare(num)) {
			System.out.println("This is perfect number");
		}else {
			System.out.println("This is not perfect number");
		}
		
	}

}
