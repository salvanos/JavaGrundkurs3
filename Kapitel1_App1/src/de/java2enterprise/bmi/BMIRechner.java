package de.java2enterprise.bmi;

public interface BMIRechner<U, V extends BMIKoerper<? super Double, ? super Double>> {
	public U rechne(V v);

}
