package de.java2enterprise.bmi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class App {
	public static void main(String[] args) throws IOException {
		new App();
	}

	public App() throws IOException {
		try(InputStream in = new FileInputStream("java.jpg");
			OutputStream out = new FileOutputStream("copy.jpg");) {
			byte[] b = new byte[in.available()];
			in.read(b);
			out.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
