package com.example.command.flyingmachine;

/**
*
* TakeOff Command
*
*/
public class AirbusFlyingMachineTakeoffCommand implements Command {

	AirbusFlyingMachine machine;

	public AirbusFlyingMachineTakeoffCommand(AirbusFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.takeOff();
		return "AirbusFlyingMachineTakeoffCommand";
	}

}
