package multiplication;

public class insurance_sale {

	public static void main(String[] args) {
		String [][] staffSales = {
				{"101TGY" , "George" , "Taylor" , "6009" , "5262" , "3745" , "7075" , "1943" , "4432"},
				{"103FCY" , "Fehlix" , "Chayne" , "8717" , "2521" , "5777" , "6189" , "5089" , "6957"},
				{"102SBY" , "Sumren" , "Bergen" , "5012" , "1063" , "7937" , "9560" , "1115" , "5499"},
				{"104SBK" , "Samira" , "Beckle" , "1140" , "9206" , "3898" , "8544" , "5937" , "8705"},
				{"105NBT" , "Nellie" , "Bogart" , "3017" , "3342" , "5939" , "2479" , "3374" , "2297"},
				{"106CGT" , "Cheryl" , "Grouth" , "9620" , "7160" , "5113" , "4803" , "5492" , "2195"},
				{"107DGT" , "Danuta" , "Graunt" , "1583" , "7450" , "1026" , "7463" , "2390" , "6509"},
				{"108JDN" , "Jaiden" , "Deckle" , "4064" , "4978" , "2984" , "3159" , "1464" , "4858"},
				{"109JCK" , "Jimran" , "Caliks" , "6253" , "7962" , "2732" , "7504" , "2771" , "5193"},
				{"110DDN" , "Deynar" , "Derran" , "6305" , "8817" , "5200" , "3647" , "3365" , "1256"}};
		
		int each_total[] = new int[staffSales.length];
		int team_total = 0;
		
		int highest = each_total[0];
		int index = 0;
		for(int row = 0; row < staffSales.length; row++) {
			for(int col = 3; col < staffSales[0].length; col++) {
				each_total[row] = Integer.parseInt(staffSales[row][col]);
			}
			System.out.println(each_total[row]);
			team_total += each_total[row];
			if(highest < each_total[row]) {
				highest = each_total[row];
				index = row;
			}
			
		
			
			
		}
		System.out.println("Total sales of whole team:" + team_total);
		System.out.println("Highest sale person: " + staffSales[index][1] + " " + staffSales[index][2] + "Sales:" + each_total[index]);
	}

}
