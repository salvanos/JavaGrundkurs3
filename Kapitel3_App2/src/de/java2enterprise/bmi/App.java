package de.java2enterprise.bmi;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		UnaryOperator<Double> quadratRechner = a -> a * a;
		BinaryOperator<Double> bmiRechner = (groesse, gewicht)-> gewicht / quadratRechner.apply(groesse);
		double bmi = bmiRechner.apply(0.51, 6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
}
