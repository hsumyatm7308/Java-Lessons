package homework;

public class abc_hw4 {

	public static void main(String[] args) {
		char[] arr = {'A','B','C','D','E'};

		for(int line = 0; line < arr.length; line++ ) {
			for(int word = 0; word < line + 1; word++) {
				System.out.print(arr[line]);
			}
			System.out.println();
		}
		
		
//		for(int word = 0; word < arr.length ; word++) {
//			for(int arrlength = 0 ; arrlength < word + 1; arrlength++) {
//				System.out.print(arr[word]);
//			}
//		}
//		
		
	
		

	}

}
