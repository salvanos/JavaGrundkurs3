package de.java2enterprise.bmi;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		double groesse = 0.51;
		double quadrat = quadriere(a -> a * a, groesse);
		Rechner<Double, Double> bmiRechner = gewicht-> gewicht / quadrat;
		double bmi = bmiRechner.rechne(6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
	
	private double quadriere(Rechner<Double, Double> rechner, double a) {
		return rechner.rechne(a);
	}
}
