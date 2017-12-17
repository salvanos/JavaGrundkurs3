package de.java2enterprise.bmi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		new App();
	}

	public App() throws IOException {
		try(BufferedReader in = new BufferedReader(new FileReader("LoremIpsum.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("kopie.txt"));) {
			String str;
			while((str = in.readLine()) != null) {
				out.write(str);
				out.newLine();
			}
		}
	}
}
