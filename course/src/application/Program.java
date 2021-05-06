package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter the rectangle measures... ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();

		System.out.println("Área: " + area);
		System.out.println("Perímetro: " + perimetro);
		System.out.printf("Diagonal: %.2f", diagonal);
				

		sc.close();
	}

}
