package Chapter3Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 10/9/18
 * Calculating energy 
 */

public class CalculatingEnergy {

	public static void main(String[] args) {
		//initializing the scanner
		Scanner input = new Scanner (System.in);
		// initializing variables
		//weight of the water
		double M;
		//initial temperature
		double InitialTemperature;
		// final temperature
		double FinalTemperature;
		//energy
		double Q;
		
		//prompting the user to enter input so that we can set up our equation
		System.out.println("Enter the weight of the water");
		M = input.nextDouble();
		System.out.println("enter the starting temperature");
		InitialTemperature = input.nextDouble();
		System.out.println("Enter the final temperature");
		FinalTemperature = input.nextDouble();
		
		// set up our equation to get the final answer
		Q = M * (FinalTemperature = InitialTemperature) * 4184;
		
		//display the answer
		System.out.println("The energy is " + Q);
		
		

	}

}
