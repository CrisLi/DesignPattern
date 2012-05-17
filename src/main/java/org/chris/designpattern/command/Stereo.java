package org.chris.designpattern.command;

public class Stereo {

	private int volume;

	public void on() {

	}

	public void setCD() {

	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void play() {
		System.out.printf("Play CD with Volume %s", volume);
	}
	
	public void off() {
		
	}
}
