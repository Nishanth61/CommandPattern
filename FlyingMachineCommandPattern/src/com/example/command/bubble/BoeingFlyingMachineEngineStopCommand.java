package com.example.command.bubble;

/**
*
* Stop Command
*
*/
public class BoeingFlyingMachineEngineStopCommand implements Command {

	BoeingFlyingMachine machine;

	public BoeingFlyingMachineEngineStopCommand(BoeingFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.engineStop();
		return "BoeingFlyingMachineEngineStopCommand";
	}

}
