package section03;

// This program computes two people's body mass index (BMI) and
// compares them.  The code uses Scanner for input.

import java.util.*;  // so that I can use Scanner

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // input BMI

	    System.out.println("Enter your information:");
        System.out.print("height (in inches)? ");
        double height = console.nextDouble();
        
        System.out.print("weight (in pounds)? ");
        double weight = console.nextDouble();
        System.out.println();

        double bmi = weight * 703 / height / height;
 
        
        System.out.println("Your BMI = " + bmi);
 
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }       
    }
}
