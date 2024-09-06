package modules.thermostat.commands;

import interfaces.Command;
import modules.thermostat.Thermostat;

public class TurnOffThermostatCommand implements Command {
	private final Thermostat thermostat;
	
	public TurnOffThermostatCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	@Override
	public void execute() {
		this.thermostat.turnOff();
	}
}
