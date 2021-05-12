package assignment;

import java.util.Scanner;

public class Practice06 {

	public static void main(String[] args) {
		//input
		Scanner input = new Scanner(System.in);
		System.out.print("Input number :");
		int num = input.nextInt();
		countFactors(num);

	}
	
	public static void countFactors(int n) {
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n % i ==0)
			{
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.println("There are "+ count);
	}

}
