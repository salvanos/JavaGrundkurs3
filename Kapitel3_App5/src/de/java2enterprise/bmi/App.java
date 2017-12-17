package de.java2enterprise.bmi;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		UnaryOperator<Double> quadratRechner = a -> a * a;
		BinaryOperator<Double> bmiRechner = (groesse, gewicht)-> gewicht / quadratRechner.apply(groesse);
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
			drucker.accept("Groesse: ");
			Double groesse = scanner.nextDouble();
			
			while(true) {
				drucker.accept("Gewicht: ");
				Double gewicht = scanner.nextDouble();
				if(testSupplier.get().test(groesse, gewicht)) {
					break;
				}
				double bmi = bmiRechner.apply(groesse, gewicht);
				drucker2.accept("BMI: %.1f%n", bmi);
			}
		}
	}
}
