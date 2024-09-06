package modules.musicPlayer;

public class MusicPlayer {
	private final int MAX_VOLUME = 100;
	private final int MIN_VOLUME = 0;
	
	private boolean isPlaying = false;
	private int volume = 100;
	
	public boolean isPlaying() {
		return isPlaying;
	}
	
	public void setPlaying(boolean playing) {
		isPlaying = playing;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public void play() {
		if (!this.isPlaying()) {
			this.setPlaying(true);
			System.out.println("Music is now playing");
		}
	}
	
	public void stop() {
		if (this.isPlaying()) {
			this.setPlaying(false);
			System.out.println("Music is stop playing");
		}
	}
	
	public void increaseVolume() {
		if (this.getVolume() < this.MAX_VOLUME && this.isPlaying()) {
			this.setVolume(this.getVolume() + 1);
			System.out.println("Music volume increased to " + this.getVolume());
		}
	}
	
	public void decreaseVolume() {
		if (this.getVolume() > this.MIN_VOLUME && this.isPlaying()) {
			this.setVolume(this.getVolume() - 1);
			System.out.println("Music volume decreased to " + this.getVolume());
		}
	}
}
