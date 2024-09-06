package modules.thermostat.commands;

import interfaces.Command;
import modules.thermostat.Thermostat;

public class TurnOnThermostatCommand implements Command {
	private final Thermostat thermostat;
	
	public TurnOnThermostatCommand(Thermostat thermostat) {
		this.thermostat = thermostat;
	}
	
	@Override
	public void execute() {
		this.thermostat.turnOn();
	}
}
