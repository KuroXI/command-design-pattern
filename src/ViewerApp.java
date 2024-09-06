import modules.light.Light;
import modules.light.commands.TurnOffLightCommand;
import modules.light.commands.TurnOnLightCommand;
import modules.musicPlayer.MusicPlayer;
import modules.musicPlayer.commands.DecreaseVolumeCommand;
import modules.musicPlayer.commands.IncreaseVolumeCommand;
import modules.musicPlayer.commands.PlayCommand;
import modules.musicPlayer.commands.StopCommand;
import modules.thermostat.Thermostat;
import modules.thermostat.commands.DecreaseTemperatureCommand;
import modules.thermostat.commands.IncreaseTemperatureCommand;
import modules.thermostat.commands.TurnOffThermostatCommand;
import modules.thermostat.commands.TurnOnThermostatCommand;
import modules.tv.Tv;
import modules.tv.commands.PowerOffTvCommand;
import modules.tv.commands.PowerOnTvCommand;

import java.util.Scanner;

public class ViewerApp {
	public static void main(String[] args) {
		CentralHub centralHub = new CentralHub();
		
		// Light Module
		Light light = new Light();
		TurnOffLightCommand turnOffLightCommand = new TurnOffLightCommand(light);
		TurnOnLightCommand turnOnLightCommand = new TurnOnLightCommand(light);
		
		// MusicPlayer Module
		MusicPlayer musicPlayer = new MusicPlayer();
		PlayCommand playCommand = new PlayCommand(musicPlayer);
		StopCommand stopCommand = new StopCommand(musicPlayer);
		IncreaseVolumeCommand increaseVolumeCommand = new IncreaseVolumeCommand(musicPlayer);
		DecreaseVolumeCommand decreaseVolumeCommand = new DecreaseVolumeCommand(musicPlayer);
		
		// Thermostat Module
		Thermostat thermostat = new Thermostat();
		TurnOnThermostatCommand turnOnThermostatCommand = new TurnOnThermostatCommand(thermostat);
		TurnOffThermostatCommand turnOffThermostatCommand = new TurnOffThermostatCommand(thermostat);
		IncreaseTemperatureCommand increaseTemperatureCommand = new IncreaseTemperatureCommand(thermostat);
		DecreaseTemperatureCommand decreaseTemperatureCommand = new DecreaseTemperatureCommand(thermostat);
		
		// Tv Module
		Tv tv = new Tv();
		PowerOnTvCommand powerOnTvCommand = new PowerOnTvCommand(tv);
		PowerOffTvCommand powerOffTvCommand = new PowerOffTvCommand(tv);
		
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("\n1 - Light");
			System.out.println("2 - MusicPlayer");
			System.out.println("3 - Thermostat");
			System.out.println("4 - Tv");
			System.out.println("5 - Exit\n");
			
			System.out.print("Enter your choice: ");
			
			int input = scanner.nextInt();
			switch (input) {
				case 1:
					_lightControls(centralHub, light, turnOnLightCommand, turnOffLightCommand);
					break;
				case 2:
					_musicPlayerControls(scanner, centralHub, musicPlayer, playCommand, stopCommand, increaseVolumeCommand, decreaseVolumeCommand);
					break;
				case 3:
					_thermostatControls(scanner, centralHub, thermostat, turnOnThermostatCommand, turnOffThermostatCommand, increaseTemperatureCommand, decreaseTemperatureCommand);
					break;
				case 4:
					_tvControls(centralHub, tv, powerOnTvCommand, powerOffTvCommand);
					break;
				case 5:
					System.out.println("Exit - John Victor Gonzales");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice");
					break;
			}
		} while (true);
	}
	
	private static void _lightControls(
		CentralHub centralHub,
		Light light,
		TurnOnLightCommand turnOnLightCommand,
		TurnOffLightCommand turnOffLightCommand
	) {
		if (!light.isTurnedOn()) {
			centralHub.setCommand(turnOnLightCommand);
		} else {
			centralHub.setCommand(turnOffLightCommand);
		}
		
		centralHub.clickButton();
	}
	
	private static void _musicPlayerControls(
		Scanner scanner,
		CentralHub centralHub,
		MusicPlayer musicPlayer,
		PlayCommand playCommand,
		StopCommand stopCommand,
		IncreaseVolumeCommand increaseVolumeCommand,
		DecreaseVolumeCommand decreaseVolumeCommand
	) {
		do {
			System.out.println("\n1 - Play / Stop");
			System.out.println("2 - Increase Volume");
			System.out.println("3 - Decrease Volume");
			System.out.println("4 - Exit\n");
			
			int musicPlayerInput = scanner.nextInt();
			switch (musicPlayerInput) {
				case 1 -> {
					if (!musicPlayer.isPlaying()) {
						centralHub.setCommand(playCommand);
					} else {
						centralHub.setCommand(stopCommand);
					}
				}
				case 2 -> centralHub.setCommand(increaseVolumeCommand);
				case 3 -> centralHub.setCommand(decreaseVolumeCommand);
				case 4 -> {
					return;
				}
				default -> {
					System.out.println("Invalid choice");
					continue;
				}
			}
			
			centralHub.clickButton();
		} while (true);
	}
	
	private static void _thermostatControls(
		Scanner scanner,
		CentralHub centralHub,
		Thermostat thermostat,
		TurnOnThermostatCommand turnOnThermostatCommand,
		TurnOffThermostatCommand turnOffThermostatCommand,
		IncreaseTemperatureCommand increaseTemperatureCommand,
		DecreaseTemperatureCommand decreaseTemperatureCommand
	) {
		do {
			System.out.println("\n1 - TurnOn / TurnOff");
			System.out.println("2 - Increase Temperature");
			System.out.println("3 - Decrease Temperature");
			System.out.println("4 - Exit\n");
			
			int thermostatInput = scanner.nextInt();
			switch (thermostatInput) {
				case 1 -> {
					if (!thermostat.isTurnedOn()) {
						centralHub.setCommand(turnOnThermostatCommand);
					} else {
						centralHub.setCommand(turnOffThermostatCommand);
					}
				}
				case 2 -> centralHub.setCommand(increaseTemperatureCommand);
				case 3 -> centralHub.setCommand(decreaseTemperatureCommand);
				case 4 -> {
					return;
				}
				default -> {
					System.out.println("Invalid choice");
					continue;
				}
			}
			
			centralHub.clickButton();
		} while (true);
	}
	
	private static void _tvControls(
		CentralHub centralHub,
		Tv tv,
		PowerOnTvCommand powerOnTvCommand,
		PowerOffTvCommand powerOffTvCommand
	) {
		if (!tv.getIsPowered()) {
			centralHub.setCommand(powerOnTvCommand);
		} else {
			centralHub.setCommand(powerOffTvCommand);
		}
		
		centralHub.clickButton();
	}
}
