package de.java2enterprise.bmi.model;

public class Messung {
	private Double groesse;
	
	private Double gewicht;

	public Messung() {
	}
	
	public Messung(Double groesse, Double gewicht) {
		this.groesse = groesse;
		this.gewicht = gewicht;
	}

	public Double getGroesse() {
		return groesse;
	}

	public void setGroesse(Double groesse) {
		this.groesse = groesse;
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}
	
	@Override
	public Object clone() {
		Messung clone = new Messung();
		clone.setGroesse(groesse);
		clone.setGewicht(gewicht);
		return clone;	
	}

	@Override
	public String toString() {
		return "Messung [groesse=" + groesse + ", gewicht=" + gewicht + "]";
	}
}
