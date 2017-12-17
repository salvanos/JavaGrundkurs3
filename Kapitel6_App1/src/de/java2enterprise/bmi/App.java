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
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("java.jpg");
			out = new FileOutputStream("copy.jpg");
			int c = 0;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				in.close();			}
			if(out != null) {
				out.close();
			}
		}
	}
}
