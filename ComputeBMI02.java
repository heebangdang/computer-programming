package section02;

/* author: Bernardo */
//source: https://codereview.stackexchange.com/questions/158197/bmi-calculator-in-java

public class ComputeBMI02 {

	public static void main(String[] args) {
		
		//declare and initialize variables
        double weight = 140; //in pound, for example 140
        int feet = 6; //in feet, for example, 6 
        int inches = 25; //in inches, for example, 25 inches

        //convert measurements
        double weightInKilos = weight * 0.453592; // 1 pound = 0.453592
        double heightInMeters = (((feet * 12) + inches) * .0254);
        double bmi = weightInKilos / (heightInMeters * heightInMeters); 

        //display output
        System.out.println("Your weight : "+ weight);
        System.out.println("Your height in feet: "+feet); 
        System.out.println("Your height in inches: "+inches);
        System.out.println("Your weight in Kg : " + (int) weightInKilos);
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Your BMI is (two decimals): " + (double) ((int)(bmi * 100) /100.0));
    }
}
