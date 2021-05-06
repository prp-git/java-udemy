package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class hotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o # de hospedes!");
		int n = sc.nextInt();
		sc.nextLine();
		Rent[] pousada = new Rent[10];

		for (int i = 0; i < n; i++) {
			System.out.println("Nome #" + (i + 1));
			String name = sc.nextLine();
			System.out.println("e-mail: ");
			String email = sc.nextLine();
			System.out.println("Quarto:");
			int quarto = sc.nextInt();
			sc.nextLine();
			pousada[quarto] = new Rent(name, email);

		}
		for (int i = 0; i < 10; i++) {
			if (pousada[i] != null) {
				System.out.println(i + ": " + pousada[i]);
			}
		}

		sc.close();
	}

}
