package multiplication;

public class exercise19 {

	public static void main(String[] args) {
		String[] tbl_breed = { "Red Chittagong", "Sussex", "Dexter", "Abondance", "Sahiwal", "Vorderwald", "Ayrshire", "Jersey", "Randall", "Alderney", "Carora", "Gloucester"};
	    int[] tbl_rating = { 1, 2, 3, 2, 3, 1, 2, 1, 2, 1, 3, 2 };        
	    int[] tbl_count = { 6, 3, 8, 7, 6, 4, 3, 7, 3, 3, 4, 7 };
	    double[] tbl_volume = { 7.5, 5.7, 11.4, 11.4, 22.0, 15.2, 21.0, 18.3, 19.0, 9.0, 23.1, 16.0 };
	    double [] tbl_dailyVolume = {0.0, 0.0, 0,0, 0,0, 0.0, 0.0, 0.0, 0.0,0.0, 0.0, 0.0, 0.0};
	    
	    System.out.println("Breed\tRating\tVolume\tCount\tTotal Volume");
	    double total = 0;
	    double max = tbl_volume[0];
	    int index = 0;
	    
	    for(int i = 0; i < tbl_breed.length;i++) {
	    	tbl_dailyVolume[i] =tbl_volume[i] * tbl_count[i];
	    	System.out.println(tbl_breed[i] + "\t" + tbl_rating[i] + tbl_volume[i] + "\t" + tbl_count[i] + "\t" + tbl_dailyVolume[i]);
	    	total += tbl_dailyVolume[i];
	    	
	    	if(tbl_rating[i]== 1) {
	    		if(max < tbl_volume[i]) {
	    			max = tbl_volume[i];
		    		index = i;
	    		}
	    	}
	    }
	    System.out.println("Total: " + total + "liters");
	    System.out.println("Recommend Breed : " + tbl_breed[index] + " Rating : " + tbl_rating[index] + tbl_volume[index]);
	}

}



















