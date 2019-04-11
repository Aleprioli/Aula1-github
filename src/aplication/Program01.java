package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//double xa, xb, xc, ya, yb, yc;
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		//xa = sc.nextDouble();
		//xb = sc.nextDouble();
		//xc = sc.nextDouble();
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		//ya = sc.nextDouble();
		//yb = sc.nextDouble();
		//yc = sc.nextDouble();
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		//double p = (xa + xb + xc)/2.0;
		//double areax = Math.sqrt(p * (p - xa) * (p - xb) * (p - xc));
		//double p = (x.a + x.b + x.c)/2.0;
		//double areax = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		double areax = x.area();
		
		//p = (ya + yb + yc)/2.0;
		//double areay = Math.sqrt(p * (p - ya) * (p - yb) * (p - yc));
		//p = (y.a + y.b + y.c)/2.0;
		//double areay = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		double areay = y.area();
			
		
		System.out.printf("Triangle X area: %.4f%n", areax);
		System.out.printf("Tuiangle y area: %.4f%n", areay);
		
		if (areax > areay) {
			System.out.println("Larger area: X");
		} else {
			if (areay > areax) {
				System.out.println("Larger area: Y");
			} else {
				System.out.println("area Y and X equal");

			}
		}
		
		
		
		
		sc.close();
	}

}
