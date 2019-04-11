package aplication;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program06 {

	//public static final double PI = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calculator = new Calculator();
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circunference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}
	//public static double circunference(double radius){
	//	return 2.0 * PI * radius;
	//}
	//public static double volume(double radius){
	//	return 4.0 * PI * radius * radius * radius / 3;
	//}
}
