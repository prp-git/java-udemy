package application;

import java.util.Scanner;

public class matrix3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.print("Número procurado... ");
		int nPROC = sc.nextInt();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == nPROC) {
					System.out.println(nPROC + " na posição: (" + i + ", " + j + ")");

				}

			}
			sc.close();
		}
	}
}
