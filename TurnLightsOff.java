package command;

public class TurnLightsOff implements Instructions
{
	private Light lights;
	
	public TurnLightsOff(Light lights)
	{
		this.lights = lights;
	}
	
	public void execute()
	{
		lights.turnLightsOff();
	}
}
