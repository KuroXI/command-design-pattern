package modules.thermostat.commands;

import interfaces.Command;
import modules.thermostat.Thermostat;

public class DecreaseTemperatureCommand implements Command {
	private final Thermostat thermostat;
	
	public DecreaseTemperatureCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	@Override
	public void execute() {
		this.thermostat.decreaseTemperature();
	}
}
