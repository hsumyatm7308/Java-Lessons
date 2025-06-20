package Collection_Exercise;

import java.util.HashMap;
import java.util.Scanner;

public class Word_Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a paragraph");
		String p = sc.nextLine();
		
		String words[] = p.split(" ");
		
//		how to work this code ? 
		HashMap<String,Integer> word_map = new HashMap();
		for(String w:words) {
			                // getOrDefault() ??? 
 			word_map.put(w,word_map.getOrDefault(w,0) + 1);
		}
		
		                  // keySet()  ???? 
		for(String wd:word_map.keySet()) {
//			System.out.println(word_map.keySet());
			System.out.println(wd+ "-" + word_map.get(wd));
		}

	}

}
