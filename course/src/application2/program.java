package application2;

import java.util.Locale;
import java.util.Scanner;

import entities2.Employee;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee N;
		N = new Employee();

		N.Name = sc.nextLine();
		N.GrossSalary = sc.nextDouble();
		N.tax = sc.nextDouble();

		System.out.println(N.toString());
		System.out.println();

		System.out.println("Which percentage to increase salary?");
		N.Increase = sc.nextDouble();
		System.out.print("Updated data: ");
		System.out.println(N.NewSalary());
		
		sc.close();

	}

}
