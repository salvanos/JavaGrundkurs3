package de.java2enterprise.bmi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		Instant instant = Instant.now();
		LocalDateTime localDateTime =
			LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
		System.out.printf(
			"%d. %s", 
			localDateTime.getDayOfMonth(),
			localDateTime.getMonth());
	}
}
