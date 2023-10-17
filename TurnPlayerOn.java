package command;

public class TurnPlayerOn implements Instructions
{
	private MusicPlayer player;
	
	public TurnPlayerOn(MusicPlayer player)
	{
		this.player = player;
	}
	
	public void execute()
	{
		player.turnPlayerOn();
	}
}