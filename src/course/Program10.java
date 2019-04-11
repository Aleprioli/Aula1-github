package course;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x, y, z;
		x = sc.next();
		y = sc.next();
		z = sc.next();
		String a, b, c;
		a = sc.next();
		b = sc.next();
		c = sc.next();

		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.print(a);
		System.out.print(" ");
		System.out.print(b);
		System.out.print(" ");
		System.out.print(c);
		
		sc.close();
	}

}
