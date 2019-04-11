package course;

import java.util.Locale;
import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter your full name: ");
		String nomeFull = sc.nextLine();
		System.out.println("How many bedrooms are there your house: ");
		int qtdBed = sc.nextInt();
		System.out.println("Enter product price: ");
		double prodPri = sc.nextDouble();
		System.out.println("Enter your last name, age and height (same line: ");
		String nomeLast = sc.next();
		int age = sc.nextInt();
		double height= sc.nextDouble();
		
		
		
		
		
		
		System.out.println(nomeFull);
		System.out.println(qtdBed);
		System.out.printf("%.2f%n", prodPri);
		System.out.print(nomeLast);
		System.out.print(" ");
		System.out.print(age);
		System.out.print(" ");
		System.out.printf("%.2f", height);
		
		
		
		
		
		sc.close();
	}

}
