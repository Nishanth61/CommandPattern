package com.example.command.bubble;
/**
*
* Controller to issue command
*
*/
public class FlyingMachineController {

	Command command;

	public FlyingMachineController() {
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public String processCommand() {
		return command.execute();
	}

}
