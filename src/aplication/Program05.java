package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("Grade1: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Grade2: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Grade3: ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());
		
		if (student.notaFinal()<60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
