package com.test.command.bubble;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.command.bubble.AirbusFlyingMachine;
import com.example.command.bubble.AirbusFlyingMachineEngineStartCommand;
import com.example.command.bubble.AirbusFlyingMachineEngineStopCommand;
import com.example.command.bubble.AirbusFlyingMachineLandingCommand;
import com.example.command.bubble.AirbusFlyingMachineTakeoffCommand;
import com.example.command.bubble.BoeingFlyingMachine;
import com.example.command.bubble.BoeingFlyingMachineEngineStartCommand;
import com.example.command.bubble.BoeingFlyingMachineEngineStopCommand;
import com.example.command.bubble.BoeingFlyingMachineLandingCommand;
import com.example.command.bubble.BoeingFlyingMachineTakeoffCommand;
import com.example.command.bubble.FlyingMachineController;

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
