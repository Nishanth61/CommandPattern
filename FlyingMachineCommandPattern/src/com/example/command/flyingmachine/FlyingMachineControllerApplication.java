package com.example.command.flyingmachine;

public class FlyingMachineControllerApplication {

	public static void main(String[] args) {

		FlyingMachineController controller = new FlyingMachineController();

		AirbusFlyingMachine airbusFlyingMachine = new AirbusFlyingMachine();
		AirbusFlyingMachineEngineStartCommand abStartCommand = new AirbusFlyingMachineEngineStartCommand(
				airbusFlyingMachine);
		AirbusFlyingMachineLandingCommand abLandingCommand = new AirbusFlyingMachineLandingCommand(airbusFlyingMachine);
		AirbusFlyingMachineTakeoffCommand abTakeOffCommand = new AirbusFlyingMachineTakeoffCommand(airbusFlyingMachine);
		AirbusFlyingMachineEngineStopCommand abStopCommand = new AirbusFlyingMachineEngineStopCommand(
				airbusFlyingMachine);

		BoeingFlyingMachine boeingFlyingMachine = new BoeingFlyingMachine();
		BoeingFlyingMachineEngineStartCommand bStartCommand = new BoeingFlyingMachineEngineStartCommand(
				boeingFlyingMachine);
		BoeingFlyingMachineLandingCommand bLandingCommand = new BoeingFlyingMachineLandingCommand(boeingFlyingMachine);
		BoeingFlyingMachineTakeoffCommand bTakeOffCommand = new BoeingFlyingMachineTakeoffCommand(boeingFlyingMachine);
		BoeingFlyingMachineEngineStopCommand bStopCommand = new BoeingFlyingMachineEngineStopCommand(
				boeingFlyingMachine);

		controller.setCommand(abStartCommand);
		controller.processCommand();
		controller.setCommand(abTakeOffCommand);
		controller.processCommand();
		controller.setCommand(abLandingCommand);
		controller.processCommand();

		controller.setCommand(abStopCommand);
		controller.processCommand();

		System.out.println();
		System.out.println("*************************************************");
		System.out.println();

		controller.setCommand(bStartCommand);
		controller.processCommand();
		controller.setCommand(bTakeOffCommand);
		controller.processCommand();
		controller.setCommand(bLandingCommand);
		controller.processCommand();

		controller.setCommand(bStopCommand);
		controller.processCommand();

	}

}
