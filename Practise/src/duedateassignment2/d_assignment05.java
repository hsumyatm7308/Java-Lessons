package duedateassignment2;

public class d_assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] libraryRecord = { { "105MS", "Marcus", "Smith", "25" }, { "103AZ", "Anthony", "Zarrent", "5" },
				{ "108MW", "Matt", "White", "12" }, { "112DB", "Denise", "Bilton", "58" },
				{ "124MK", "Malcolm", "Kelly", "26" }, { "116UK", "Uzere", "Kevill", "29" },
				{ "127AL", "Abduraheim", "Leahy", "94" }, { "124LS", "Laura", "Sampras", "50" },
				{ "121AP", "Azra", "Potter", "61" }, { "115AC", "Anthony", "Calik", "10" },
				{ "117PI", "Pablo", "Iilyas", "49" }, { "113MM", "Mark", "Montgomerie", "67" },
				{ "130FH", "Felicity", "Heath", "11" }, { "132JA", "Jill", "Alexander", "61" },
				{ "123SG", "Sara", "Grimstow", "9" }, { "134KD", "Kevin", "Dawson", "74" },
				{ "122AB", "Andrew", "Bertwistle", "42" }, { "125JF", "Jaide", "Feehily", "55" },
				{ "128JS", "Justin", "Slater", "68" }, { "126CG", "Colleen", "Grohl", "39" } };

		int totalNumOfBooks = 0;
		// show The IDs of pupils who have read fewer than ten books
		for (int i = 0; i < libraryRecord.length; i++) {
			int numOfBooks = Integer.parseInt(libraryRecord[i][3]);
			totalNumOfBooks = totalNumOfBooks + numOfBooks;

			if (numOfBooks < 10) {
				System.out.println("The IDs of pupils who have read fewer than ten books :  " + libraryRecord[i][0]);
				System.out.println();
			}
		}
		// create array for medals winner
		String[][] sortedRecords = new String[libraryRecord.length][4];
		for (int i = 0; i < libraryRecord.length; i++) {
			sortedRecords[i] = libraryRecord[i];
		}
		// bubble sort for winners
		for (int i = 0; i < sortedRecords.length - 1; i++) {
			for (int j = i + 1; j < sortedRecords.length; j++) {
				int booksI = Integer.parseInt(sortedRecords[i][3]);
				int booksJ = Integer.parseInt(sortedRecords[j][3]);
				if (booksJ > booksI) {
					String[] temp = sortedRecords[i];
					sortedRecords[i] = sortedRecords[j];
					sortedRecords[j] = temp;
				}
			}
		}
		System.out.println("total number : " + totalNumOfBooks + " Books");
		System.out.println();
		System.out.println("average number : " + totalNumOfBooks / libraryRecord.length + " Books");
		System.out.println();
		System.out.println("ID : " + sortedRecords[0][0] + "\t" + " Name : " + sortedRecords[0][1] + "\t"
				+ sortedRecords[0][2] + " Books - " + sortedRecords[0][3]);
		System.out.println();
		System.out.println("ID : " + sortedRecords[1][0] + "\t" + " Name : " + sortedRecords[1][1] + "\t"
				+ sortedRecords[1][2] + " Books - " + sortedRecords[1][3]);
		System.out.println();
		System.out.println("ID : " + sortedRecords[2][0] + "\t" + " Name : " + sortedRecords[2][1] + "\t"
				+ sortedRecords[2][2] + " Books - " + sortedRecords[2][3]);

	}

}
