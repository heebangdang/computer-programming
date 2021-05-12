package section03;

import java.util.*;
public class ConditionalOperator03 {
	public static void main(String[] args) {
		//Checking if marks greater than 50 or not
		String status;
		int marks;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your Marks (between 0 to 100) >> ");
		marks = input.nextInt();
		status= marks>=50 ?"You are Passed":"You are failed";
		System.out.println("Status= " + status);
	}
}