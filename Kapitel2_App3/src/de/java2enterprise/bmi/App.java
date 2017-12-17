package de.java2enterprise.bmi;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		double groesse = 0.51;
		BMIRechner rechner = gewicht-> gewicht / (groesse * groesse);
		double bmi = rechner.rechne(6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
}
