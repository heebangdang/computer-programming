package section03;

import java.util.Scanner;

public class Conditional02 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		double gpa = console.nextDouble();
		if (gpa >= 2.0) {
		    System.out.println("Welcome to Mars University!");
		} else {
		    System.out.println("Application denied.");
		}
	}
}
