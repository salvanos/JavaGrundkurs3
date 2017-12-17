package de.java2enterprise.bmi;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		double groesse = 0.51;
		Rechner quadratRechner = a -> a * a;
		Rechner bmiRechner = gewicht-> gewicht / quadratRechner.rechne(groesse);
		double bmi = bmiRechner.rechne(6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
}
