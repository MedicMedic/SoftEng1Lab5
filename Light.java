package command;

public class Light 
{
	private static boolean isLightOn = false;
	
	public void turnLightsOn()
	{
		System.out.println("Lights are on!");
		isLightOn = true;
	}
	public void turnLightsOff()
	{
		System.out.println("Lights are off!");
		isLightOn = false;
	}
	public static boolean isLightOn() {
		return isLightOn;
	}
	public static void setLightOn(boolean LightOn) {
		isLightOn = LightOn;
	}
}
