package multiplication;
import java.util.Scanner;
public class exercise12 {
	
	static float circlearea(float radius) {
		float PI = 3.1416f;
		float area = (radius * radius) * PI;
		
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		float radius = Float.parseFloat(sc.nextLine());
		
		float area = circlearea(radius);
		System.out.println(area);
		
	}

}
