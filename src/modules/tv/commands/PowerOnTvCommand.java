package modules.tv.commands;

import interfaces.Command;
import modules.tv.Tv;

public class PowerOnTvCommand implements Command {
	private final Tv tv;
	
	public PowerOnTvCommand(Tv tv){
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		this.tv.switchOn();
	}
}
