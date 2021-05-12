package section03;

import java.util.*;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many kids do you have? ");
		int num = input.nextInt();
		
		switch(num) {
		  case 1: System.out.println("You must be very happy");
			     break;
		  case 2: System.out.println("Perfect");
			     break;
		  case 3: System.out.println("That's awesome");
			     break;
		  case 4: System.out.println("You are powerful");
			     break;
		  default: System.out.println("WOW");
		}
	}
}
