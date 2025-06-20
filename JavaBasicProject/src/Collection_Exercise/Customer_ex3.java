package Collection_Exercise;

public class Customer_ex3 {
	private int id ;
	private String name;
	private String issueType;
	
	public Customer_ex3() {}
	public Customer_ex3(int id,String n,String type) {
		this.id = id;
		this.name = n;
		this.issueType = type;
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
	public String getIssueType() {
		return issueType;
	} 
	public void setIssueType(String issueType) {
		this.issueType = issueType;
	}
	public String toString() {
		return "ID : " + this.getId() + "Name:" + this.getName() + " Issued Type:" + this.getIssueType();
	}
}
