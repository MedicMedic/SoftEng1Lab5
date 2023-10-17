package command;

public class TurnLightsOn implements Instructions
{
	private Light lights;
	
	public TurnLightsOn(Light lights)
	{
		this.lights = lights;
	}
	
	public void execute()
	{
		lights.turnLightsOn();
	}
}
