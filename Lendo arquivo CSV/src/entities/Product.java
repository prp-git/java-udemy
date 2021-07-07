package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Product {
	
	String path = "/home/paulo/workspaces/eclipse-ide/source.txt"
	
	try {(BufferedReader br = new BufferedReader(new FileReader(path)))
	}
	catch {
		(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
