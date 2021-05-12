package section03;

import java.util.*;   // so that I can use Scanner

public class InputString {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);

	     System.out.print("Today temperature is: ");
	     double num = console.nextDouble(); // for example, 27
	     //int num = console.nextDouble();
	     //double num = console.nextInt();

	     System.out.print("What is your opinion? ");
	     String text1 = console.next(); //input "Cool. It is Fall Now"
	     
	     String text2 = console.nextLine();
	     
	     System.out.println("Temperature is: "+num);
	     System.out.println(text1);
	     System.out.println(text2);
	}
}
