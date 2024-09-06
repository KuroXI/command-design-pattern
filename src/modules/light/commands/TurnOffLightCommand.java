package modules.light.commands;

import interfaces.Command;
import modules.light.Light;

public class TurnOffLightCommand implements Command {
	private final Light light;
	
	public TurnOffLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOff();
	}
}
