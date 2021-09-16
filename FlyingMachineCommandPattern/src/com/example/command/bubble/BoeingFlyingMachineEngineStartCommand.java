package com.example.command.bubble;

/**
*
* Start Command
*
*/
public class BoeingFlyingMachineEngineStartCommand implements Command {

	BoeingFlyingMachine machine;

	public BoeingFlyingMachineEngineStartCommand(BoeingFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.engineStart();
		return "BoeingFlyingMachineEngineStartCommand";
	}

}
