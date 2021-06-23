package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.BusinessException;

public class TratamentoExcecoes {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.next();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account acc = new Account(number, holder, balance, withdrawLimit);

		System.out.println();
		System.out.print("Enter amount for withdraw:");
		Double amount = sc.nextDouble();

		try {
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f", acc.getBalance());
		} catch (BusinessException e) {
			System.out.println(e.getMessage());

		}
	}

}
