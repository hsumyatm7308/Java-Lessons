package multiplication;

import java.util.Scanner;

public class exercise14 {
//	static int hms_to_secs(int h,int m,int s) {
//		 h = h * 3600;
//		 m = m * 60;
//		 s = h + m + s;
//		
//		return s;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter hour");
//		int h = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter minute");
//		int m = Integer.parseInt(sc.nextLine());
//		System.out.println("Enter second");
//		int s = Integer.parseInt(sc.nextLine());
//		System.out.println(hms_to_secs(h,m,s));
//
//	}
	
	
//	with sensei 
	static int hms_to_secs(int h,int m, int s) {
		return h*3600+m*60+s;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter hour:minute:second format:");
		String time = sc.nextLine();
		String t[] = time.split(":");
		int hour = Integer.valueOf(t[0]);
		int minute = Integer.valueOf(t[1]);
		int second = Integer.valueOf(t[2]);
		
		int total_seconds = hms_to_secs(hour,minute,second);
		System.out.println("Total second " + total_seconds);

	}

}
