package command;

public class TurnThermosOn implements Instructions
{
	private Thermostat thermostat;
	
	public TurnThermosOn(Thermostat thermostat)
	{
		this.thermostat = thermostat;
	}
	
	public void execute()
	{
		thermostat.turnThermosOn();
	}
}
