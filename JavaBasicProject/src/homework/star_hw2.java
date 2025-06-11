package homework;

public class star_hw2 {

	public static void main(String[] args) {
		
		for(int line = 1; line <= 6 ; line++) {
			for(int space = 1; space <= 6 - line; space++) {
				System.out.print(" ");
				
			}
			
			for(int star = 1; star <= line ; star++) {
				System.out.print("*");
			}

		
			System.out.println();
		}
	}

}
