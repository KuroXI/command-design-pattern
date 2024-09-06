package modules.thermostat;

public class Thermostat {
	private final int MIN_TEMPERATURE = 16;
	private final int MAX_TEMPERATURE = 26;
	
	private boolean isTurnedOn = false;
	private int temperature = 20;
	
	public boolean isTurnedOn() {
		return isTurnedOn;
	}
	
	public void setTurnedOn(boolean turnedOn) {
		isTurnedOn = turnedOn;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	
	public void turnOn() {
		this.setTurnedOn(true);
		System.out.println("Thermostat is turned on");
	}
	
	public void turnOff() {
		this.setTurnedOn(false);
		System.out.println("Thermostat is turned off");
	}
	
	public void increaseTemperature() {
		if (this.getTemperature() < MAX_TEMPERATURE && this.isTurnedOn()) {
			this.setTemperature(this.getTemperature() + 1);
			System.out.println("Temperature increased to " + this.getTemperature());
		}
	}
	
	public void decreaseTemperature() {
		if (this.getTemperature() > MIN_TEMPERATURE && this.isTurnedOn()) {
			this.setTemperature(this.getTemperature() - 1);
			System.out.println("Temperature decreased to " + this.getTemperature());
		}
	}
}
