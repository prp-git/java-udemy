package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class teste {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();

		String path = "/home/paulo/workspaces/eclipse-ide/source.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String [] vect = line.split(",");
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				Product prod = new Product(name, price, qte);
				list.add(prod);
				
				line = br.readLine();	
			}
			System.out.println("Products: ");
			for (Product p : list) {
				System.out.println(p);
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());;
		}
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(path, true))) {

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
