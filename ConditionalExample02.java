package section03;

import java.util.Scanner;

public class ConditionalExample02 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input two strings : ");
		String word1 = input.next();
		String word2 = input.next();
		
		if (word1 == word2) {
			System.out.println("1. The two words are the same");
		}
		
		if (word1.equals(word2)) {
			System.out.println("2. The two words are the same");
		}
		
		if (word1.equalsIgnoreCase(word2)) {
			System.out.println("3. The two words are the same");
		}
	}
}
