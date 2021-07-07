package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Set<Student> set = new HashSet<>();

		String[] curso = new String[3];
		curso[0] = "A";
		curso[1] = "B";
		curso[2] = "C";

		for (int j = 0; j < curso.length; j++) {

			System.out.print("How many students for course " + curso[j] + "? ");
			int quantity = sc.nextInt();
			for (int i = 0; i < quantity; i++) {
				int number = sc.nextInt();
				set.add(new Student(number, curso[j]));
			}
		}
		System.out.println("Total students: " + set.size());

	}
}