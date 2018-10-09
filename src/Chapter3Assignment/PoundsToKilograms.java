package Chapter3Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 10/4/18
 * Converting pounds to kilograms
 */

public class PoundsToKilograms {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initializing variables
		
		double pounds;
		double kilos;
		
		//getting the input for pounds
		 
		System.out.println("enter the value in pounds");
		pounds = input.nextDouble();
		
		//taking the input for pounds and converting it into kilograms
		kilos = pounds * 0.454;
		
		//displaying final answer
		
		System.out.println(pounds + " pounds, converted into kilograms is " + kilos + " kilograms");

	}

}
