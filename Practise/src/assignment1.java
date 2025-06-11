
public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String passwords[] = { "Jhzsledx2", "Kbwwasyaa", "Emti9mkxx", "Oewdbekh7", "ffuy8ntf8", "Aejahczx7",
				"Blmqgpjn5", "Ndjehzbz5", "Dslcfvxw", "Dbjipyhv8", "Pesdhqaf2", "Znmotmow9", "Hkcoqkkz9", "hjroeomx6",
				"Wknimqip4", "Pfudlmcd8", "Eodmjxky0", "Nreozcvmr", "Xykhsnqp8", "Isrhydgq8", "Vtwoitwe0", "Mnmdekrl5",
				"Fxxegcno4", "Uvybymbx9", "Azggugnb6", "Qugfvntn5", "Ymnxibhl5", "Essnfuhy7", "Qrrvgbbt8", "Sgfgzzod9",
				"5rmlowuyy9" };

		int count = 0;
		for (int i = 0; i < passwords.length; i++) {
			if (passwords[i].charAt(0) >= 65 && passwords[i].charAt(0) <= 90) {
				boolean flag = false;
				for (int num = 0; num <= 9; num++) {

					String tostr = "" + num;

					if (passwords[i].contains(tostr) == true) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					System.out.println(passwords[i]);
					count++;
				}
			} else {
				System.out.println(passwords[i]);
				count++;
			}
		}
		System.out.println(count);
	}

}
