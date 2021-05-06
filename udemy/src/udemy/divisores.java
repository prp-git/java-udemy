package udemy;

import java.util.Scanner;

public class divisores {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i=1; i<=x; i++) {
			if (x % i == 0 && i != x) {
				System.out.printf(i + "-");
			}
			if (x % i == 0 && i == x) {
				System.out.print(i);
			}
		}
		sc.close();
	}
}
