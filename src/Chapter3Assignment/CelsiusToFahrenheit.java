package Chapter3Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 8/4/18
 * Converting celsius to fahrenheit
 */

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initializing variables
		
		double celsius;
		double fahrenheit;
		
		//getting input for our celsius value
		
		System.out.println("What is the temperature in celsius that you want to convert?");
		celsius = input.nextDouble();
		
		//taking the celsius value and converting it into fahrenheit
		
		fahrenheit = (9/5) * celsius + 32;
		
		//displaying our final answer
		
		System.out.println("Here is your temperature in fahrenheit");
		System.out.println(fahrenheit);
		
		

	}

}
