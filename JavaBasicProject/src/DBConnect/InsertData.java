package DBConnect;

public class InsertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB obj = new ConnectDB();
		System.out.println(obj.connect());
		System.out.println(obj.disconnect());
	}

}
