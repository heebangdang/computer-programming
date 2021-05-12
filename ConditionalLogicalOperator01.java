package section03;

import java.util.*;
public class ConditionalLogicalOperator01 {

	public static void main(String[] args) {

		/*in some cases, you can indicate the real numbers 
		 * with d (double) or f (float) at the end of the numbers
		*/
		double number1 = 120.345d;
		double number2 = 345.21d;
		double number3 = 234.21d;
		if(number1 < number2 && number1< number3){
			System.out.println("The smallest Number is number1");
		}
		if(number3 >number2 || number3 > number1){
			System.out.println("number3 is not the smallest");
		}
	}
}
