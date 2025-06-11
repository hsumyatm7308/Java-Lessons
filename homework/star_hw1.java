package homework;

public class star_hw1 {

	public static void main(String[] args) {
		for(int line = 1; line <= 6; line++) {

			for(int star = 1; star <= line * 2 - 1; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
