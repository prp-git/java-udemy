package udemy;

import java.util.Scanner;

public class divisao_2_numeros {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=0; i<n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (B == 0) System.out.println("divisao impossivel");
			else System.out.println(A / B);
		}
		sc.close();
	}
}
