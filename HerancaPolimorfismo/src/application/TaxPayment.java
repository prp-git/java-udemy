package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class TaxPayment {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual Income: ");
			Double anualIncome = sc.nextDouble();
			if (type == 'c') {
				System.out.print("Employee number: ");
				Integer employeeNumber = sc.nextInt();
				list.add(new Company(name,anualIncome, employeeNumber));
			}
			else {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name,anualIncome, healthExpenditures));
			}
			System.out.println();
			System.out.println("TAXES PAID:");
			double sum = 0;
			for (TaxPayer p : list) {
				System.out.println(p.getName() + " $ " + String.format("%.2f", p.taxesPaid()));	
				sum += p.taxesPaid();
			}
			System.out.println();
			System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));
		}
				
		sc.close();
	}

}
