package de.java2enterprise.bmi;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class App {
	public static void main(String[] args) throws IOException {
		new App();
	}

	public App() throws IOException {
		Path source = Paths.get("java.jpg");
		Path target = Paths.get("kopie.jpg");
		CopyOption[] options = {
			StandardCopyOption.REPLACE_EXISTING,
			StandardCopyOption.ATOMIC_MOVE
		};
		Files.move(source, target, options);
	}
}
