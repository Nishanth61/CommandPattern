package com.example.command.flyingmachine;
/**
 *
 * Start Command
 *
 */
public class AirbusFlyingMachineEngineStartCommand implements Command {

	AirbusFlyingMachine machine;

	public AirbusFlyingMachineEngineStartCommand(AirbusFlyingMachine machine) {
		this.machine = machine;

	}

	@Override
	public String execute() {
		machine.engineStart();
		return "AirbusFlyingMachineEngineStartCommand";
	}

}
