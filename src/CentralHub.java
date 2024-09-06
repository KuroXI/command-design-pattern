import interfaces.Command;

public class CentralHub {
	private Command command;
	
	public CentralHub(Command command) {
		this.command = command;
	}
	
	public CentralHub() {}
	
	public Command getCommand() {
		return this.command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void clickButton() {
		this.getCommand().execute();
	}
}
