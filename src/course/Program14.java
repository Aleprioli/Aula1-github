package course;

public class Program14 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG   ";
		
		String minusculas = original.toLowerCase();

		System.out.println("Original   |" + original + "|");
		System.out.println("Minusculas |" + minusculas + "|");

		String maiusculas = original.toUpperCase();

		System.out.println("Original   |" + original + "|");
		System.out.println("Maiusculas |" + maiusculas + "|");

		String espacoCanto = original.trim();

		System.out.println("Original     |" + original + "|");
		System.out.println("espaco canto |" + espacoCanto + "|");

		String apartir = original.substring(2);

		System.out.println("Original |" + original + "|");
		System.out.println("a partir |" + apartir + "|");

		String entre = original.substring(2, 9);

		System.out.println("Original |" + original + "|");
		System.out.println("entre    |" + entre + "|");

		String subistitui = original.replace('a', 'x');

		System.out.println("Original   |" + original + "|");
		System.out.println("subistitui |" + subistitui + "|");

		String subistitui1 = original.replace("abc", "xy");

		System.out.println("Original    |" + original + "|");
		System.out.println("subistitui1 |" + subistitui1 + "|");

		int i1 = original.indexOf("bc");
		int i2 = original.lastIndexOf("bc");

		System.out.println("indexOf     |" + i1 + "|");
		System.out.println("lastIndexOf |" + i2 + "|");
	}

}
