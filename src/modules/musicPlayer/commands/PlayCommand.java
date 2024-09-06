package modules.musicPlayer.commands;

import interfaces.Command;
import modules.musicPlayer.MusicPlayer;

public class PlayCommand implements Command {
	private final MusicPlayer musicPlayer;
	
	public PlayCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	@Override
	public void execute() {
		this.musicPlayer.play();
	}
}
