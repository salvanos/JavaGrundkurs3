package de.java2enterprise.bmi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App {
	public static void main(String[] args) {
		new App();
	}

	public App() {
		LocalDate localDate = LocalDate.of(1996, Month.JANUARY, 23);
		LocalTime localTime = LocalTime.of(10, 30, 0);
		LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d. MMMM yyyy 'um' HH:mm 'Uhr'");
		System.out.println(localDateTime.format(formatter));
	}
}
