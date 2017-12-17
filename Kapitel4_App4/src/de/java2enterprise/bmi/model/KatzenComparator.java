package de.java2enterprise.bmi.model;

import java.util.Comparator;

public class KatzenComparator implements Comparator<Katze> {

	@Override
	public int compare(Katze o1, Katze o2) {
		return Double.compare(
			o1.getMessung().getGroesse(),
			o2.getMessung().getGroesse());
	}

}
