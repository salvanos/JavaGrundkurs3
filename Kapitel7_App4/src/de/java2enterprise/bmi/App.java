package de.java2enterprise.bmi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
	public static void main(String[] args) throws IOException {
		new App();
	}

	public App() throws IOException {
		Files
			.newDirectoryStream(Paths.get("/Users/trainer/Documents"))
			.forEach(System.out::println);
	}
}
