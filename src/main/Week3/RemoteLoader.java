package main.Week3;

public class RemoteLoader {
 
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
 
		GearShift gearShift = new GearShift("In manual mode");
		Brakes brakes = new Brakes("Main Brake");

		remoteControl.setCommand(0, gearShift::Drive, gearShift::Parking);
		remoteControl.setCommand(1, brakes::Applied, brakes::NotApplied);
  
		System.out.println(remoteControl);
 
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
		remoteControl.onButtonWasPushed(4);  
		remoteControl.offButtonWasPushed(4);
		remoteControl.onButtonWasPushed(5);
	}
}
