package de.java2enterprise.bmi;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleSupplier;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Supplier;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		DoubleUnaryOperator quadratRechner = a -> a * a;
		DoubleBinaryOperator bmiRechner = (groesse, gewicht)-> gewicht / quadratRechner.applyAsDouble(groesse);
		Consumer<String> drucker = System.out::print;
		BiConsumer<String, Double> drucker2 = System.out::printf;
		Supplier<BiPredicate<Double, Double>> testSupplier = () -> {
			BiPredicate<Double, Double> tester = (groesse, gewicht) -> {
				if(groesse < 0.0 || groesse > 1.0 || gewicht < 0.0 || gewicht > 100.0) {
					return true;
				}
				return false;
			};
			return tester;
		};
		
		try(Scanner scanner = new Scanner(System.in)) {
			DoubleSupplier doubleSupplier = scanner::nextDouble;
			drucker.accept("Groesse: ");
			Double groesse = doubleSupplier.getAsDouble();
			
			while(true) {
				drucker.accept("Gewicht: ");
				Double gewicht = doubleSupplier.getAsDouble();
				if(testSupplier.get().test(groesse, gewicht)) {
					break;
				}
				double bmi = bmiRechner.applyAsDouble(groesse, gewicht);
				drucker2.accept("BMI: %.1f%n", bmi);
			}
		}
	}
}
