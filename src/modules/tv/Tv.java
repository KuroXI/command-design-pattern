package modules.tv;

public class Tv {
	private boolean isPowered = false;
	
	public boolean getIsPowered() {
		return this.isPowered;
	}
	
	public void setIsPowered(boolean isPowered) {
		this.isPowered = isPowered;
	}
	
	public void switchOn() {
		this.setIsPowered(true);
		System.out.println("Tv is switched-on!");
	}
	
	public void switchOff() {
		this.setIsPowered(false);
		System.out.println("Tv is switched-off");
	}
}
