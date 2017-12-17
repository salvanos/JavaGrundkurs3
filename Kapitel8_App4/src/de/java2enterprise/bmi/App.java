package de.java2enterprise.bmi;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		Date date = new Date();
		Instant instant = date.toInstant();
		Date date2 = Date.from(instant);
		Calendar cal = Calendar.getInstance();
		Instant instant3 = cal.toInstant();
	}
}
