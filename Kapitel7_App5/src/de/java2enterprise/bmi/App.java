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
			.forEach(path-> {
				try {
					System.out.println(
							(Files.isDirectory(path) ? "d" : "-") +
							(Files.isReadable(path) ? "r" : "-") +
							(Files.isWritable(path) ? "w" : "-") +
							(Files.isExecutable(path) ? "x" : "-") +
							(Files.isHidden(path) ? "h" : "-") + "\t" +
							(Files.getOwner(path).getName()) + "\t" +
							(Files.getLastModifiedTime(path)) + "\t" +
							(path.getFileName())
						
					);
				} catch(IOException e) {
					e.printStackTrace();
					
				}
			});
	}
}
