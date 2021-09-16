package com.example.command.bubble;

/**
*
* stop Command
*
*/
public class AirbusFlyingMachineEngineStopCommand implements Command {

	AirbusFlyingMachine machine;

	public AirbusFlyingMachineEngineStopCommand(AirbusFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.engineStop();
		return "AirbusFlyingMachineEngineStopCommand";
	}

}
