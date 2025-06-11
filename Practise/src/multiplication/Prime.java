package multiplication;

public class Prime {
	public static void main(String args[]) {
//		how many prime number 
		int[] arr = {1,0,3,2,4,7,10};
		int count = 0;
		boolean stage = false;
		
		
		for(int i = 0; i <= arr.length - 1; i++) {
			
			if(arr[i] <= 1) {
				System.out.println( arr[i] + " is not prime number");
				continue;
			}
			
			for(int j = 2; j <= arr[i] ; j++) {
				if(arr[i] % j != 0 ) {
					stage = true;
					break;					
				}
			}

			
			if(stage) {
				System.out.println(arr[i] + " This is prime number");
			}else {
				System.out.println(arr[i] +  " This is not prime number");
			}
		
		}
		

	}

}
