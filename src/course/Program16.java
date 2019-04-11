package course;

public class Program16 {

	public static void main(String[] args) { 
		int a = 7;
		int b = 6;
		int c = 5;
		
//		if (a > b) {
//			if (a > c) {
//				System.out.println(a + " maior que " + b + " e " + c);
//			} else {
//				System.out.println(c + " maior que " + a + " e " + b);
//			}
//			
//		} else {
//			if (b > c) {
//				System.out.println(b + " maior que " + a + " e " + c);
//			} else {
//				System.out.println(c + " maior que " + a + " e " + b);
//			}
//		}
		if (a > b && a > c) {
				System.out.println(a + " maior que " + b + " e " + c);
			} else {
				if (b > c) {
					System.out.println(b + " maior que " + a + " e " + c);
				} else {
					System.out.println(c + " maior que " + a + " e " + b);
			}
		}
	}
}