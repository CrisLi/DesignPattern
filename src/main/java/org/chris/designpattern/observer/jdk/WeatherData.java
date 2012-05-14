package org.chris.designpattern.observer.jdk;

import java.util.Observable;

/**
 * 1 You first must call the setChanged() method to signify that the state has
 * changed in your object.
 * 
 * 2 Then, call one of two notifyObservers() methods: either notifyObservers()
 * or notifyObservers(Object arg)
 * 
 * @author Chris
 * 
 */
public class WeatherData extends Observable {

	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
