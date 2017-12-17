package de.java2enterprise.bmi.model;

public class Katze {
	private String name;
	private Messung messung;

	public Katze() {
	}
	
	public Katze(String name, Messung messung) {
		this.name = name;
		this.messung = messung;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Messung getMessung() {
		return messung;
	}

	public void setMessung(Messung messung) {
		this.messung = messung;
	}

	@Override
	public Object clone() {
		Katze clone = new Katze();
		clone.setName(name);
		clone.setMessung((Messung) messung.clone());
		return clone;	
	}

	@Override
	public String toString() {
		return "Katze [name=" + name + " messung=" + messung + "]";
	}
}
