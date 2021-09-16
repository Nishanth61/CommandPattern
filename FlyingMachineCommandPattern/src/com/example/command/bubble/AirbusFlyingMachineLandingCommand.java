package com.example.command.bubble;

/**
*
* Landing Command
*
*/
public class AirbusFlyingMachineLandingCommand implements Command {

	AirbusFlyingMachine machine;

	public AirbusFlyingMachineLandingCommand(AirbusFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.landing();
		return "AirbusFlyingMachineLandingCommand";
	}

}
