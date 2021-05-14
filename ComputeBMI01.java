package section02;

public class ComputeBMI01 {

	public static void main(String[] args) {
		//declare variables
        double weight;
        int feet;
        int inches;

        //assign initial value
        weight = 140; //in pound, for example 140
        feet = 6; //in feet, for example, 6. 1 feet = 12 inches.
        inches = 25; //in inches, for example, 25 inches

        int height = feet * 12 + inches;
        double bmi = weight * 703 / (height * height);

        //display output
        System.out.println("Your weight : "+ weight);
        System.out.println("Your height in feet: "+feet); 
        System.out.println("Your height in inches: "+inches);
        System.out.println("Your BMI is: " + bmi);
	}
}
