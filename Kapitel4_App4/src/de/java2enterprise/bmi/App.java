package de.java2enterprise.bmi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.java2enterprise.bmi.model.Katze;
import de.java2enterprise.bmi.model.KatzenComparator;
import de.java2enterprise.bmi.model.Messung;


public class App {
	private List<Katze> katzen = new ArrayList<>();
	
	public static void main(String[] args) {
		new App();
	}

	public App() {
		katzen.add(new Katze("Pinki", new Messung(0.51, 6.1)));
		katzen.add(new Katze("Flo", new Messung(0.5, 5.0)));
		katzen.add(new Katze("Kajimbo", new Messung(0.6, 8.5)));
		katzen.add(new Katze("Fifone", new Messung(0.66, 7.2)));
		katzen.add(new Katze("Lilli", new Messung(0.40, 10.5)));
		
		//Gebe die Katzen sortiert nach Namen aus
		Collections.sort(katzen);
		for(Katze katze : katzen) {
			System.out.println(katze);
		}
		
		//Gebe die Katzen sortiert nach der Größe aus
		Collections.sort(katzen, new KatzenComparator());
		for(Katze katze : katzen) {
			System.out.println(katze);
		}
	}
}
