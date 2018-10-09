package Chapter3Assignment;
import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		//setting up the scanner so that we can get input
		Scanner input = new Scanner (System.in);
		//initializing variables (starting velocity, end velocity, time, average)
		//start velocity
		double v1;
		//end velocity
		double v2;
		//time
		double t;
		//average acceleration
		double a;
		
		// Prompting input from the user so that we can set up our equation
		System.out.println("Enter the starting velocity");
		v1 = input.nextDouble();
		System.out.println("Enter the ending velocity");
		v2 = input.nextDouble();
		System.out.println("enter the time passed in seconds");
		t = input.nextDouble();
		
		//initializing the equation
		a = (v2 - v1) / t;
		
		//displaying the answer
		System.out.println("The average acceleration is " + a);
		

	}

}
