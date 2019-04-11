package aplication;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int neg = 0;
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
//		for (int i = 0; i < n; i++) {
		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < n; j++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("|------|");
//		for (int i = 0; i < n; i++) {
		for (int i = 0; i < mat.length; i++) {
//			for (int j = 0; j < n; j++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0){
					++neg;
				}
				if (j == 0) {
				System.out.print("|"+ mat[i][j]  + "|");
				}else {
				System.out.print(mat[i][j] + "|");
				}
			}
		System.out.println(" ");
		System.out.println("|------|");
		}
		System.out.println(" ");
		System.out.println("Main diagonal: ");
		System.out.println("|------|");
//		for (int i = 0; i < n; i++) {
		for (int i = 0; i < mat.length; i++) {
			if (i == 0) {
				System.out.print("|");
			} 
//			for (int j = 0; j < n; j++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (i == j) {
					System.out.print(mat[i][j] + "|");
				} 
			}
		}
		System.out.println(" ");
		System.out.println("|------|");
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Negative numbers = " + neg);
		sc.close();
	}

}
