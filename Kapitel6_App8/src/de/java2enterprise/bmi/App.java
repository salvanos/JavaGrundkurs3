package de.java2enterprise.bmi;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import de.java2enterprise.bmi.model.Katze;

public class App {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		new App();
	}

	public App() throws IOException, ClassNotFoundException {
		Katze katze = new Katze();
		katze.setGroesse(0.51);
		katze.setGewicht(6.1);
		
		ObjectOutputStream out = 
			new ObjectOutputStream(
				new BufferedOutputStream(
					new FileOutputStream("Katze.dat")));
		out.writeObject(katze);
		out.close();
		
		ObjectInputStream in = 
			new ObjectInputStream(
				new BufferedInputStream(
					new FileInputStream("Katze.dat")));
		Object object = in.readObject();
		in.close();
		if(object != null) {
			Katze importierteKatze = (Katze) object;
			System.out.println(importierteKatze.getGroesse());
			System.out.println(importierteKatze.getGewicht());
		}
	}
}
