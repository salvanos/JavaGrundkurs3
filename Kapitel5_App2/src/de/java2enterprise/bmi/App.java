package de.java2enterprise.bmi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.Messung;


public class App {
	private List<Katze> katzen = new ArrayList<>();
	
	public static void main(String[] args) {
		new App();
	}

	public App() {
		Comparator<Katze> comparator = (k1, k2)-> {
			return Double.compare(
					k1.getMessung().getGroesse(),
					k2.getMessung().getGroesse());
		};
		katzen.add(new Katze("Pinki", new Messung(0.51, 6.1)));
		katzen.add(new Katze("Flo", new Messung(0.5, 5.0)));
		katzen.add(new Katze("Kajimbo", new Messung(0.6, 8.5)));
		katzen.add(new Katze("Fifone", new Messung(0.66, 7.2)));
		katzen.add(new Katze("Lilli", new Messung(0.40, 10.5)));
		
		//Gebe die Katzen sortiert nach Namen aus
		katzen.stream().sorted().forEach(System.out::println);
		
		//Gebe die Katzen sortiert nach der Größe aus
		katzen.stream().sorted(comparator).forEach(System.out::println);
		
		//Gebe die Größe der größten Katze aus
		Optional<Katze> optional = katzen.stream().max(comparator);
		optional
			.map(Katze::getMessung)
			.map(Messung::getGroesse)
			.ifPresent(System.out::println);
	}
}
