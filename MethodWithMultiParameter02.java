package section05;

import java.util.Scanner;

public class MethodWithMultiParameter02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		int batch;
		
		while(!name.equalsIgnoreCase("exit")){		
			System.out.print("Input your name :");
			name = input.next();
			System.out.print("Input your batch : ");// The year you enter university
			batch = input.nextInt();
			printTheName(name, batch);
		}
		System.out.println("Thank you!");
	}
	
	public static void printTheName(String n, int batch) {
		if(!n.equalsIgnoreCase("exit")) {
		  System.out.print(n);
		  System.out.print(" is a good Name ");
		  System.out.println("in the batch of "+batch);
		}
	}
}
