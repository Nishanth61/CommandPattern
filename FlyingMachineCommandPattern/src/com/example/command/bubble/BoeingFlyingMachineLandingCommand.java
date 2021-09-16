package com.example.command.bubble;

/**
*
* Landing Command
*
*/
public class BoeingFlyingMachineLandingCommand implements Command {

	BoeingFlyingMachine machine;

	public BoeingFlyingMachineLandingCommand(BoeingFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.landing();
		return "BoeingFlyingMachineLandingCommand";
	}

}
