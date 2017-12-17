package de.java2enterprise.bmi.model;

import java.io.Serializable;

public class Katze implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2049206056347112346L;
	private Double groesse;
	private Double gewicht;

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

}
