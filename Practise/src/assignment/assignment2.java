package assignment;

import java.util.Scanner;

public class assignment2 {
	static String generate(String animals[]) {
//		int index = (int) (Math.random() * animals.length)+0;
		int index = (int) (Math.random() * animals.length) + 0;
		return animals[index];

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] words = { "antelope", "ape", "badger", "bear", "beaver", "bison", "crocodile", "elephant", "elk",
				"ferret", "goat", "goose", "kangaroo", "llama", "lion", "monkey", "moose", "orangutan", "shark",
				"snake", "tiger", "whale", "wombat" };

		String secret = generate(words);

		int attempts = secret.length() + 3;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		boolean flag = false;
		String correct = "";
		String wrong = "";
		while (attempts > 0) {

			System.out.println("The length of secret word is " + secret.length());
			System.out.println("You have chance " + (attempts) + " left");
			System.out.println("Enter guessing word:");
			String guess = sc.nextLine();
			count++;
			attempts--;

			if (guess.equals(secret)) {
				System.out.println("You Won!");
				System.out.println("You try" + count + " attempts.");
				flag = true;
				break;
			} else {
				for (char c1 : guess.toCharArray()) {
					boolean test = false;
					for (char c2 : secret.toCharArray()) {
						if (c1 == c2) {
							for (char cc : correct.toCharArray()) {
								if (c1 == cc) {
								
									test = true;
									break;
								}

							}
							
							if(!test) {
								correct += c1;

							}
							

						}

					}
					if (!test) {
						for (char cc : wrong.toCharArray()) {
							if (cc ==c1) {
								test = true;
								break;

							}
						}
						
						if(!test) {
							wrong += c1;

						}
					}
				}
			}

		}

		if (!flag) {
			System.out.println("Game Over! You lost!" + secret);
			System.out.println("The secret word is " + secret);
			System.out.println("The correct letters : " + correct);
			System.out.println("The wrong letters: " + wrong);
		}
	}

}
