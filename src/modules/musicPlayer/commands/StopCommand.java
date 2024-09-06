package modules.musicPlayer.commands;

import interfaces.Command;
import modules.musicPlayer.MusicPlayer;

public class StopCommand implements Command {
	private final MusicPlayer musicPlayer;
	
	public StopCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	@Override
	public void execute() {
		this.musicPlayer.stop();
	}
}
