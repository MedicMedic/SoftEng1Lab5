package command;

public class TurnThermosOff implements Instructions
{
	private Thermostat thermostat;
	
	public TurnThermosOff(Thermostat thermostat)
	{
		this.thermostat = thermostat;
	}
	
	public void execute()
	{
		thermostat.turnThermosOff();
	}
}