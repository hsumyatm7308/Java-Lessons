package Collection;
import java.util.ArrayList;
public class ArrayList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		al.remove(2);
		al.remove(3);
		
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		al.clear(); // remove all elements
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
	}

}
