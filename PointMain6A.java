package Practice03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PointMain6A {

	public static void main(String[] args) throws FileNotFoundException {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the number of points: ");
	    int numberOfPoints = input.nextInt();

	    //fill in the blank to show the correct answers according to the problem
	    
	    
	  	printPoint(points);
	  	distance(points);
	}
	  	public static void printPoint(Point[] array) {
			for(Point p: array) {
				System.out.println(p.getX() + " "+p.getY());
			}
		}
	  	
	  	public static void distance(Point[] array) {
			// Initial two points
			int p1 = 0, p2 = 1; 
			
			// Initialize shortestDistance
			double shortestDistance = array[p1].distance(array[p2]);  
			
			// Compute distance for every two points
			for(int i=0; i<array.length;i++) {
				for(int j=i+1; j<array.length;j++) {
					double distance = array[i].distance(array[j]); // Find distance

					        if (shortestDistance > distance) {
					          p1 = i; // Update p1
					          p2 = j; // Update p2
					          shortestDistance = distance; // Update shortestDistance 
					        }
				}
			}
			
			// Display result
		    System.out.println("The closest two points are " +
		      "(" + array[p1].getX() + ", " + array[p1].getY() + ") and (" +
		      array[p2].getX() + ", " + array[p2].getY() + ")");
				
			
		}

}
