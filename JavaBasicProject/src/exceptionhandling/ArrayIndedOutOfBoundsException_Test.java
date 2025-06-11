package exceptionhandling;

public class ArrayIndedOutOfBoundsException_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {10,20,30,40,50};
		num[8] = 100;
		try {
			for(int i = 0; i < num.length; i++) {
				System.out.println(num[i]);
			}
			System.out.println(num[8]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index value is in range 0 - 4");
		}
		


	}

}
