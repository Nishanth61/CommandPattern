package com.test.command.flyingmachine;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.command.flyingmachine.AirbusFlyingMachine;
import com.example.command.flyingmachine.AirbusFlyingMachineEngineStartCommand;
import com.example.command.flyingmachine.AirbusFlyingMachineEngineStopCommand;
import com.example.command.flyingmachine.AirbusFlyingMachineLandingCommand;
import com.example.command.flyingmachine.AirbusFlyingMachineTakeoffCommand;
import com.example.command.flyingmachine.BoeingFlyingMachine;
import com.example.command.flyingmachine.BoeingFlyingMachineEngineStartCommand;
import com.example.command.flyingmachine.BoeingFlyingMachineEngineStopCommand;
import com.example.command.flyingmachine.BoeingFlyingMachineLandingCommand;
import com.example.command.flyingmachine.BoeingFlyingMachineTakeoffCommand;
import com.example.command.flyingmachine.FlyingMachineController;

class FlyingMachineControllerTest {

	AirbusFlyingMachine airbusFlyingMachine;
	AirbusFlyingMachineEngineStartCommand abStartCommand;
	AirbusFlyingMachineLandingCommand abLandingCommand;
	AirbusFlyingMachineTakeoffCommand abTakeOffCommand;
	AirbusFlyingMachineEngineStopCommand abStopCommand;

	BoeingFlyingMachine boeingFlyingMachine;
	BoeingFlyingMachineEngineStartCommand bStartCommand;
	BoeingFlyingMachineLandingCommand bLandingCommand;
	BoeingFlyingMachineTakeoffCommand bTakeOffCommand;
	BoeingFlyingMachineEngineStopCommand bStopCommand;

	@BeforeEach
	public void setup() {
		airbusFlyingMachine = new AirbusFlyingMachine();
		abStartCommand = new AirbusFlyingMachineEngineStartCommand(airbusFlyingMachine);
		abLandingCommand = new AirbusFlyingMachineLandingCommand(airbusFlyingMachine);
		abTakeOffCommand = new AirbusFlyingMachineTakeoffCommand(airbusFlyingMachine);
		abStopCommand = new AirbusFlyingMachineEngineStopCommand(airbusFlyingMachine);

		boeingFlyingMachine = new BoeingFlyingMachine();
		bStartCommand = new BoeingFlyingMachineEngineStartCommand(boeingFlyingMachine);
		bLandingCommand = new BoeingFlyingMachineLandingCommand(boeingFlyingMachine);
		bTakeOffCommand = new BoeingFlyingMachineTakeoffCommand(boeingFlyingMachine);
		bStopCommand = new BoeingFlyingMachineEngineStopCommand(boeingFlyingMachine);

	}

	@Test
	public void AirbusFlyingMachineApp() {

		FlyingMachineController controller = new FlyingMachineController();

		controller.setCommand(abStartCommand);

		String output = controller.processCommand();

		assertEquals("AirbusFlyingMachineEngineStartCommand", output);

		controller.setCommand(abTakeOffCommand);

		output = controller.processCommand();

		assertEquals("AirbusFlyingMachineTakeoffCommand", output);

		controller.setCommand(abLandingCommand);

		output = controller.processCommand();

		assertEquals("AirbusFlyingMachineLandingCommand", output);

		controller.setCommand(abStopCommand);

		output = controller.processCommand();

		assertEquals("AirbusFlyingMachineEngineStopCommand", output);

	}

	@Test
	public void BoeingFlyingMachineApp() {

		FlyingMachineController controller = new FlyingMachineController();

		controller.setCommand(bStartCommand);

		String output = controller.processCommand();

		assertEquals("BoeingFlyingMachineEngineStartCommand", output);

		controller.setCommand(bTakeOffCommand);

		output = controller.processCommand();

		assertEquals("BoeingFlyingMachineTakeoffCommand", output);

		controller.setCommand(bLandingCommand);

		output = controller.processCommand();

		assertEquals("BoeingFlyingMachineLandingCommand", output);

		controller.setCommand(bStopCommand);

		output = controller.processCommand();

		assertEquals("BoeingFlyingMachineEngineStopCommand", output);

	}

}
