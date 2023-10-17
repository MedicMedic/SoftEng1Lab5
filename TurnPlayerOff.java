package command;

public class TurnPlayerOff implements Instructions
{
	private MusicPlayer player;
	
	public TurnPlayerOff(MusicPlayer player)
	{
		this.player = player;
	}
	
	public void execute()
	{
		player.turnPlayerOff();
	}
}