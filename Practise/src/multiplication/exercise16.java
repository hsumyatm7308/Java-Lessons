package multiplication;
import java.util.Scanner;;
public class exercise16 {
	static void display(String name[]) {
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
		}
		
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = Integer.parseInt(sc.nextLine());
		String names[] = new String[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter name");
			names[i] = sc.nextLine();
		}
		

		for (int i = 0; i < names.length - 1; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if(names[i].compareTo(names[j]) < 0 ) {
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;

					}
			}
		}
		
		System.out.println("After Sorting by decending");
		display(names);

	}

}
