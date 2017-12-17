package de.java2enterprise.bmi;

import java.util.function.BiFunction;
import java.util.function.Function;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		Function<Double, Double> quadratRechner = a -> a * a;
		BiFunction<Double, Double, Double> bmiRechner = (groesse, gewicht)-> gewicht / quadratRechner.apply(groesse);
		double bmi = bmiRechner.apply(0.51, 6.1);
		System.out.printf("BMI: %.1f", bmi);
	}
}
