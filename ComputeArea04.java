package section03;

import java.util.*;   // so that I can use Scanner

public class ComputeArea04 {
    public static void main(String[] args) {
        
        final double PI = 3.14159; // a constant – recommended on using upper case
        
        Scanner console = new Scanner(System.in);

        //input the radius
        System.out.print("Input Radius (in meter): ");
        int radius = console.nextInt();

        //calculate the area
        double area = radius * radius * PI; 

        //show the output
        System.out.println("Area : "+ area + " m2");
    }
}

