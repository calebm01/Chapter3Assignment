package Chapter3Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen 
 * 10/4/18
 * Converting feet into meters
 */
public class FeetToMeters {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initializing variables
		
		double feet;
		double meters;
		
		// getting the input for feet
		
		System.out.println("input feet value to convert");
		feet = input.nextDouble();
		
		//finding the conversion from feet to meters
		
		meters = feet * 0.305;
		
		//displaying the final answer
		System.out.println(feet + " converted to meters is " + meters);
		

	}

}
