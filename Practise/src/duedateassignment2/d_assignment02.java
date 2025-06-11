package duedateassignment2;
import java.util.Scanner;
public class d_assignment02 {
	
	static int recursive_power(int num, int pow){
		if(pow == 0) {
			return 1;
		}else {
			int result = num * recursive_power(num,pow-1);
			return result;
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the power");
		int power = Integer.parseInt(sc.nextLine());
		System.out.println(recursive_power(num,power));
	}

}
