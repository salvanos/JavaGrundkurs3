package de.java2enterprise.bmi;

public class App {

	public static void main(String[] args) {
		new App();
	}

	public App() {
		BMIRechner rechner = new BMIRechner() {
			@Override
			public double rechne(double groesse, double gewicht) {
				return gewicht / (groesse * groesse);
			}
		};
		double bmi = rechner.rechne(0.51, 6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
}
