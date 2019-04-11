package course;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter with 1 number: ");
		int num = sc.nextInt();
	
		
		while (num <= 0) {
			System.out.println("N must be positive! Try again: ");
			num = sc.nextInt();
		}
		
		if (num == 1) {
			System.out.println("Enter with " + num + " number: ");
			
		}
		else {
			System.out.println("Enter with " + num + " numbers: ");
		}
		//sc.next();
		
		int higher = 0;
		for (int i = 1; i <= num ; i++) {
			//System.out.println("Value #" + i + ": " );
			int v1 = sc.nextInt();
			if (v1 > higher){
				higher = v1;
			}
		}
		System.out.println( "higher = " + higher);
		sc.close();
	}

}
