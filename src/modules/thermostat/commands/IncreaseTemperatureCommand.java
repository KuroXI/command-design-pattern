package modules.thermostat.commands;

import interfaces.Command;
import modules.thermostat.Thermostat;

public class IncreaseTemperatureCommand implements Command {
	private final Thermostat thermostat;
	
	public IncreaseTemperatureCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	@Override
	public void execute() {
		this.thermostat.increaseTemperature();
	}
}
