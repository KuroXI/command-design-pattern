package modules.light.commands;

import interfaces.Command;
import modules.light.Light;

public class TurnOnLightCommand implements Command {
	private final Light light;
	
	public TurnOnLightCommand(Light light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		this.light.turnOn();
	}
}
