import java.util.Locale;
import java.util.Scanner;

public class Perimeter_Area {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		double lenght;
		double width;
		double height;
		double area;
		double perimeter;
		double volume;
		String response;
		
		System.out.println("To calculate the area and perimeter of the classroom, insert the following values:");


		//Loop will run the calculations first, and then checked if the user wants to keep calculating rooms.
		do {
			System.out.println("Lenght: ");
			lenght = scnr.nextDouble();

			System.out.println("Width: ");
			width = scnr.nextDouble();

			System.out.println("Height: ");
			height = scnr.nextDouble();
			
			area = lenght * width;
			System.out.println("The area is: " + area + " sqft.");

			perimeter = lenght * 2 + width * 2;
			System.out.println("The perimeter is: " + perimeter + " ft.");

			volume = lenght * height * width;
			System.out.println("The volume is: " + volume + " ft.");
			
			System.out.println("Do you want to continue measuring rooms? (y/n): ");
			response = scnr.next();

		} while (response.equalsIgnoreCase("y"));
		
		
		

			}
	
}