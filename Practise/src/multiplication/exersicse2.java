package multiplication;
import java.util.Scanner;
public class exersicse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		float radius = sc.nextFloat();
		
		float PI = 3.1416f;
		float area = (radius * radius) * PI;
		System.out.println("Radius : " + radius);
		System.out.println("Area : " + area);

	}

}
