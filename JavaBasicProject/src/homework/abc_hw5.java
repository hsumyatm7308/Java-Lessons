package homework;

public class abc_hw5 {

	public static void main(String[] args) {
		char[] arr = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O' };

		int idx = 0;

		for (int word = 0; word < 5; word++) {
		    for (int start = 0; start <= word; start++) {
		        System.out.print(arr[idx]);
		        idx++;
		    }
		    System.out.println();
		}


//		for hw 7 
//		for (int word = 0; word < 5; word++) {
//			for (int start = word; start < word + word; start++) {
//				System.out.print(arr[start]);
//			}
//			
//			System.out.println();
//
//		}

	}

}
