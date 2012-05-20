package org.chris.designpattern.interator;

/**
 * 
 * The Iterator Pattern
 * 
 * provides a way to access the elements of an aggregate object sequentially
 * without exposing its underlying representation.
 * 
 * Design Principle
 * 
 * A class should have only one reason to change.
 * 
 * @author Chris
 * 
 */
public interface Iterator<T> {

	public boolean hasNext();

	public T next();
}
