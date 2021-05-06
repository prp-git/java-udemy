package application;

import java.util.Scanner;

public class matrix {

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
				if (i != 0) {
					System.out.println("Na posição acima: " + matriz[(i - 1)][j]);
				}
				if (i < (matriz[i].length - 1)) {
					System.out.println("Na posição abaixo: " + matriz[(i + 1)][j]);
				}
				if (j > 0) {
					System.out.println("À esquerda: " + matriz[i][(j - 1)]);
				}
				if (j < (matriz.length - 1)) {
					System.out.println("À direita: " + matriz[i][(j + 1)]);
				}
			}

		}
		sc.close();
	}
}
