package modules.light;

public class Light {
	private boolean isTurnedOn = false;
	
	public boolean isTurnedOn() {
		return isTurnedOn;
	}
	
	public void setTurnedOn(boolean turnedOn) {
		isTurnedOn = turnedOn;
	}
	
	public void turnOn() {
		this.setTurnedOn(true);
		System.out.println("Turning on the light");
	}
	
	public void turnOff() {
		this.setTurnedOn(false);
		System.out.println("Turning off the light");
	}
}
