package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Program10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Products[] vect = new Products[n];
		
		for (int i = 0; i < vect.length; i++) {
//		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		double sum = 0.0;
		for (int i = 0; i < vect.length; i++) {
//		for (int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
//		double avg = sum / n;
		System.out.printf("Average Price: %.2f%n", avg);
		
		sc.close();
	}

}