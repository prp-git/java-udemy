package udemy;

import java.util.Scanner;

public class quadrado_cubo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			System.out.printf("%d %d %d%n", i, i*i, i*i*i);
		}
		sc.close();
	}
}
