package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class xxx {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<Product>();

		System.out.println("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File (sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
			
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
		
		try (BufferedWriter br = new BufferedWriter(new FileWriter(path2, true))) {
			for (Product p : list) {
				br.write(p.getName() + "," + String.format("%.2f", p.vritem()));
				br.write
				br.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
