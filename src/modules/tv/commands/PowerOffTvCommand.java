package modules.tv.commands;

import interfaces.Command;
import modules.tv.Tv;

public class PowerOffTvCommand implements Command {
	private final Tv tv;
	
	public PowerOffTvCommand(Tv tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.switchOff();
	}
}
