package org.chris.designpattern.facade;

/**
 * 
 * The Facade Pattern
 * 
 * provides a unified interface to a set of interfaces in a subsytem. Facade
 * defines a higher level interface that makes the subsystem easier to use.
 * 
 * Design Principle
 * 
 * Principle of Least Knowledge - talk only to your immediate friends.
 * 
 * @author Chris
 * 
 */
public class HomeTheaterFacade {

	private Amplifier amp;
	private DvdPlayer dvd;
	private Projector projector;
	private TheaterLights lights;
	private Screen screen;
	private PopcornPopper popper;

	public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector,
			TheaterLights lights, Screen screen, PopcornPopper popper) {
		this.amp = amp;
		this.dvd = dvd;
		this.projector = projector;
		this.lights = lights;
		this.screen = screen;
		this.popper = popper;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}

	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
