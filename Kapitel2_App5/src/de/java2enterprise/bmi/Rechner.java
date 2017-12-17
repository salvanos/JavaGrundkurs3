package de.java2enterprise.bmi;


@FunctionalInterface
public interface Rechner<T, R> {
	public R rechne(T t);
}
