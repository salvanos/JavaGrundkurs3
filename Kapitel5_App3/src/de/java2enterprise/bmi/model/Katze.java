package de.java2enterprise.bmi.model;

public class Katze implements Comparable<Katze> {
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

	@Override
	public int compareTo(Katze andereKatze) {
		String andererName = andereKatze.getName();
		return name.compareTo(andererName);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Katze other = (Katze) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
