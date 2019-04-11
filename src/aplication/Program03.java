package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		double area = rectangle.area();
		double perimeter = rectangle.perimeter();
		double diagonal = rectangle.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		
		

		sc.close();
	}
}
