package com.example.command.bubble;
/**
*
* TakeOff Command
*
*/
public class BoeingFlyingMachineTakeoffCommand implements Command {

	BoeingFlyingMachine machine;

	public BoeingFlyingMachineTakeoffCommand(BoeingFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.takeOff();
		return "BoeingFlyingMachineTakeoffCommand";
	}

}
