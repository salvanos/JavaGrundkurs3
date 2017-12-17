package de.java2enterprise.bmi;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class App {
	public static void main(String[] args) throws IOException {
		new App();
	}

	public App() throws IOException {
		Reader in = null;
		Writer out = null;
		try {
			in = new FileReader("LoremIpsum.txt");
			out = new FileWriter("kopie.txt");
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if(in != null) {
				in.close();
			}
			if( out != null) {
				out.close();
			}
		}
	}
}
