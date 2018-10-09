package Chapter3Assignment;
import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 10/4/18
 * Finding the volume of a cylinder
 */

public class VolumeOfACylinder {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		//initializing variables
		
		double radius;
		double length;
		double area;
		double volume;
		double PI = 3.14;
		
		//getting input for radius and length
		
		System.out.println("what is the radius?");
		radius = input.nextDouble();
		System.out.println("what is the length?");
		length = input.nextDouble();
		
		// taking the inputs and finding area and volume
		
		area = radius*radius*PI;
		volume = area * length;
		
		//displaying our final answers
		System.out.println("the area is " + area);
		System.out.println("the volume is " + volume);

		
	}

}
