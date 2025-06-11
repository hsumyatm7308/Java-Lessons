package Collection;

import java.util.ArrayList;
public class Student_Collection_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList slist = new ArrayList();
		Student s1 = new Student(101,"Aung Aung",1,78,"aung@gmail.com");
		slist.add(s1);
		Student s2 = new Student();
		s2.setId(102);
		s2.setName("Su Su");
		s2.setRno(2);
		s2.setMark(33);
		s2.setEmail("su@gmail.com");
		slist.add(s2);
		for(int i = 0; i < slist.size();i++) {
			System.out.println(slist.get(i).toString());
		}

	}

}
