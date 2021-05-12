package section05;

import java.util.Scanner;

public class MethodWith1Parameter02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String name = "";
		
		while(!name.equalsIgnoreCase("exit")){		
			System.out.print("Input your name :");
			name = input.next();
			printTheName(name);
		}
		System.out.println("Thank you!");
	}
	
	public static void printTheName(String n) {
		if(!n.equalsIgnoreCase("exit")) {
		  System.out.print(n);
		  System.out.println(" is a good Name");
		}
	}
}
