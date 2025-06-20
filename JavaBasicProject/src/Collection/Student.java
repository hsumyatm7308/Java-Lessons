package Collection;

public class Student {
	private int id;
	private String name;
	private int rno;
	private int mark;
	private String email;
	
	public Student() {}
	public Student(int id,String n,int rno,int m, String email) {
		this.id = id;
		this.name = n;
		this.rno = rno;
		this.mark = m;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String result() {
		if(getMark() >= 50) {
			return "Pass";
		}else {
			return "Fail";
		}
	}
	
	public String toString() {
		return "Name: " + getName() + "ID: " + getId() + "Roll No: " + getRno() + "Email: " + getEmail() + "Mark:" + getMark() + "Result:" + result();
	}
}
