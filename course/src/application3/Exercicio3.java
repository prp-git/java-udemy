package application3;

import java.util.Locale;
import java.util.Scanner;

import entities3.Aluno;

public class Exercicio3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno x;
		x = new Aluno();
		
		x.Name = sc.nextLine();
		x.n1 = sc.nextDouble();
		x.n2 = sc.nextDouble();
		x.n3 = sc.nextDouble();
		
		System.out.println(x.toString());
		
		
		
		
		sc.close();
	}

}
