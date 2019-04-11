package course;

public class Program7 {

	public static void main(String[] args) {
		int n1 = 3 + 4 * 2;
		System.out.println(n1);
		
		int n2 = (3 + 4) * 2;
		System.out.println(n2);

		int n3 = 17 % 3;
		System.out.println(n3);

		//double n4 = 10.0 / 8.0;
		double n4 = (double) 10 / 8;
		System.out.println(n4);

		double a = 1.0, b = -3.0, c = -4.0;
		double x1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2.0 * a);
		System.out.println(x1);

	}
}                     