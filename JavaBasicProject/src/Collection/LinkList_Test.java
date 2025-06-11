package Collection;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkList_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.add(10000);
		list.add(2000);
		list.addFirst(1111);
		list.addLast(666);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.offer(222);
		list.offer(444);
		list.offer(788);
		
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		list.remove(2);
		list.remove(1);
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Using iterator:");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
