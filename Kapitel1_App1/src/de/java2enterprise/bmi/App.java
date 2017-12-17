package de.java2enterprise.bmi;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		new App();

	}
	
	public App() {
		BMIRechner<Double, BMIKoerper<Double, Double>> rechner = 
				new BMIRechner<Double, BMIKoerper<Double,Double>>() {
			
			@Override
			public Double rechne(BMIKoerper<Double, Double> v) {
				return v.getF() / (v.getE() * v.getE());
			}
		};
				
				
		BMIKoerper<Double, Double> koerper = new BMIKoerper<>();
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.print("Groesse: ");
			koerper.setE(scanner.nextDouble());
			
			System.out.print("Gewicht: ");
			koerper.setF(scanner.nextDouble());
			
			
			System.out.printf("BMI-Wert: %.1f", rechner.rechne(koerper));
		}
	}
	
	public static <U> void gibAllesUntereinanderAus(U... u) {
		for(U element : u) {
			System.out.println(element);
		}
		
		
	}

}
