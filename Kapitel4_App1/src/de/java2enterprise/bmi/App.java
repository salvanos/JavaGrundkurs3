package de.java2enterprise.bmi;

import de.java2enterprise.bmi.model.Katze;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		Katze katze1 = new Katze(0.51, 6.1);
		Katze katze2 = (Katze) katze1.clone();
		
		System.out.println(katze1);
		System.out.println(katze2);
	}
}
