package de.java2enterprise.bmi.model;

public class Katze {
	private double groesse;
	
	private double gewicht;

	public Katze() {
	}
	
	public Katze(double groesse, double gewicht) {
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

	public double getGroesse() {
		return groesse;
	}

	public void setGroesse(double groesse) {
		this.groesse = groesse;
	}

	public double getGewicht() {
		return gewicht;
	}

	public void setGewicht(double gewicht) {
		this.gewicht = gewicht;
	}
	
	@Override
	public Object clone() {
		Katze clone = new Katze();
		clone.setGroesse(groesse);
		clone.setGewicht(gewicht);
		return clone;	
	}

	@Override
	public String toString() {
		return "Katze [groesse=" + groesse + ", gewicht=" + gewicht + "]";
	}
}
