package section03;

import java.util.Scanner;

public class SwitchExample02 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a number :");
		int num = input.nextInt();
		
		switch(num) {
		case 1 :  
		case 2 : 
		case 3 : 
		case 4 : 
		case 5 : System.out.println("a number smaller than 5");
				break;
		
		default: System.out.println("A number that is not between 1 and 5");
		       break;
		}
	}
}
