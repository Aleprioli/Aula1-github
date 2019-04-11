package aplication;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lin = sc.nextInt();
		int col = sc.nextInt();
		int [][] mat = new int[lin][col];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("|----------|");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (j == 0) {
				System.out.print("|"+ mat[i][j]  + "|");
				}else {
				System.out.print(mat[i][j] + "|");
				}
			}
		System.out.println(" ");
		System.out.println("|----------|");
		}
		
		sc.nextLine();
		int num = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == num) {
					System.out.println("Position = " + i + "," + j);
					int x = i; int y = j;
					if ( --y >= 0){
						System.out.println("Left: " + mat[x][y]);
					}
					x = i; y = j;
					if (++y < mat[i].length) {
							System.out.println("Right: " + mat[x][y]);
					}
					x = i; y = j;
					if (--x >= 0 ){
						System.out.println("Up: " + mat[x][y]);	
					}
					x = i; y = j;
					if(++x < mat.length){
							System.out.println("Down: " + mat[x][y]);	
							
					}
					
				}
			}
		}
		
		sc.close();
	}

}
