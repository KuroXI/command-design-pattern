package modules.musicPlayer.commands;

import interfaces.Command;
import modules.musicPlayer.MusicPlayer;

public class DecreaseVolumeCommand implements Command {
	private final MusicPlayer musicPlayer;
	
	public DecreaseVolumeCommand(MusicPlayer musicPlayer) {
		this.musicPlayer = musicPlayer;
	}
	
	@Override
	public void execute() {
		this.musicPlayer.decreaseVolume();
	}
}
