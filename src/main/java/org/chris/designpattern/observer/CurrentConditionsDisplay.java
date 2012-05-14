package org.chris.designpattern.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;

	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.printf(
				"Current conditions: temperature %s F degrees, humidity %s and pressure %s.\n",
				temperature, humidity, pressure);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

}
