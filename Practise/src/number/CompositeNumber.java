package number;

public class CompositeNumber {
	static boolean isCompositeNumber(int n) {
		boolean composite = false;
		for(int div = 1; div <= n; div++) {
			if(n % div == 0) {
				System.out.println(div);
				composite = true;
				
			}
		}
		if(composite) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 

	}

}
