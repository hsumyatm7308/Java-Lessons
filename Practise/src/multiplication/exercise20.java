package multiplication;

public class exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] studentName = {
				{"Kevin", "Horney", "71", "55"},
				{"Tony", "Tison", "36", "50"},
				{"David", "Smith", "39", "48"},
				{"Vicky", "Bertwistle", "58", "71"},
				{"Jason", "Blashaw", "49", "80"},
				{"Louise","Smith", "81", "67"},
				{"Sara", "Acton", "37", "66"},
				{"Donna", "Alexander", "84", "86"},
				{"Michael", "Mitchelle", "65", "55" },
				{"Anthony", "Lewis", "48", "50"},
				{"Sharon", "Grant", "53", "70"},
				{"Peter", "Hughes", "82", "90"},
				{"Deborah", "Biddle", "51", "47"},
				{"Dawn", "Doens", "35", "44"},
				{"William", "Dennis", "72", "73"},
				{"Selim", "Biddle", "52", "67"},
				{"Ian", "Nadeem", "40", "36"},
				{"Jenny", "Thomson", "56", "43"},
				{"Rowena", "Moore", "50", "77"},
				{"Jane", "Murphy", "44", "48"}};

		for(int i = 0; i < studentName.length; i++)
		{
//			System.out.println(studentName[i][2]);
			int eng_mark = Integer.parseInt( studentName[i][2]);
			int math_mark = Integer.parseInt( studentName[i][3]);

			if(eng_mark < 40 && math_mark < 50) {
				System.out.println(studentName[i][0] + studentName[i][1] + " failed both test");
			}else if(eng_mark < 40 || math_mark < 50) {
				System.out.println(studentName[i][0] +studentName[i][1] + " failed one test");	
			}else if(eng_mark >= 80 && math_mark >= 85){
				System.out.println(studentName[i][0] + studentName[i][1] + " pass with D");	
	
			}else {
				System.out.println(studentName[i][0] + studentName[i][1] + " pass");	

			}
			
			System.out.println();
			
		}
	}

}
