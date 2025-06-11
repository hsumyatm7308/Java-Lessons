package Collection_Exercise;

public class Student {
	private int rollno;
	private String name;
	private int marks;
	
	public Student() {}
	public Student(int rno,String n, int m) {
		this.rollno = rno;
		this.name = n;
		this.marks = m;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public String toString() {
		return "Nameဂ " + getName() + " Roll No: " + getRollno() + " Marks: " + getMarks();
	}
	
}
