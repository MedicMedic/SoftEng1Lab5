package command;

public class Thermostat 
{
	private static boolean isThermosOn = false;
	private static int temperature = 25;
	
	public void turnThermosOn()
	{
		System.out.println("Thermostat is on!");
		isThermosOn = true;
	}
	public void turnThermosOff()
	{
		System.out.println("Thermostat is off!");
		isThermosOn = false;
	}
	public void newTemperature()
	{
		System.out.println ("Temperature is now: " + temperature);
	}
	public static boolean isThermosOn() {
		return isThermosOn;
	}
	public static void setThermosOn(boolean ThermosOn) {
		isThermosOn = ThermosOn;
	}
	public static int getTemperature() {
		return temperature;
	}
	public static void setTemperature(int temperature) {
		Thermostat.temperature = temperature;
	}
}