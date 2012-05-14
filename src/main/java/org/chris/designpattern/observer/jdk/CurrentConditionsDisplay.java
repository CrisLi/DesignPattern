package org.chris.designpattern.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

	private Observable observable;

	private float temperature;
	private float humidity;
	private float pressure;

	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPressure();
			display();
		}
	}

	public void display() {
		System.out.printf(
				"Current conditions: temperature %s F degrees, humidity %s and pressure %s.\n",
				temperature, humidity, pressure);
	}

}
