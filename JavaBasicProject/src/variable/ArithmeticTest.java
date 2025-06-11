package variable;
import java.util.Scanner;

public class ArithmeticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine();
		int first_num = 23;
		int second_num = 10;
		char op = '+';
		
		if(op == '+') {
			int sum = first_num + second_num;
			System.out.println("Addition = " + sum);
		}else if(op == '-'){
			int minus = first_num - second_num;
			System.out.println("Sustration = " + minus);
		}else if(op == '*') {
			int multi = first_num + second_num;
			System.out.println("Multiplication = " + multi);
		}else if(op == '%') {
			int module = first_num % second_num;
			System.out.println("Modules = " + module);
		}else if(op == '/') {
			int quotient = first_num / second_num;
			System.out.println("Multiplication = " + quotient);
		}else {
			System.out.println("Invalid Operator");
		}
		
		
	}

}
