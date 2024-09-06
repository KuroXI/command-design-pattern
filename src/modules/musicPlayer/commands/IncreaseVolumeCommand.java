package modules.musicPlayer.commands;

import interfaces.Command;
import modules.musicPlayer.MusicPlayer;

public class IncreaseVolumeCommand implements Command {
	private final MusicPlayer musicPlayer;
	
	public IncreaseVolumeCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	@Override
	public void execute() {
		this.musicPlayer.increaseVolume();
	}
}
