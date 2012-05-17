package org.chris.designpattern.command;


/**
 * 
 * The NoCommand object is an example of a null object. A null object is useful
 * when you don’t have a meaningful object to return, and yet you want to remove
 * the responsibility for handling 'null' from the client.
 * 
 * @author Chris
 * 
 */
public class NoCommand implements Command {

	@Override
	public void execute() {

	}

	@Override
	public void undo() {
		
	}

}
