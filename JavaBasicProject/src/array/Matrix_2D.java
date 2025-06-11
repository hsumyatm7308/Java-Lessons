package array;

public class Matrix_2D {

	public static void main(String[] args) {
		int matrix[][] = {{10,5,15,},{5,10,15},{2,4,6}};
		for(int row= 0; row < 3; row++) {
			for(int column = 0; column < 3; column++) {
				System.out.print(matrix[row][column] + "\t");
			}
			System.out.println();
		}
	}

}
