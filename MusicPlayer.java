package command;

public class MusicPlayer 
{
	private static boolean isPlayerOn = false;
	private static int volume = 25;
	private static String song = "StellarSong - Happy Ending";
	
	public void turnPlayerOn()
	{
		System.out.println("Music Player is on!");
		isPlayerOn = true;
	}
	public void turnPlayerOff()
	{
		System.out.println("Music Player is off!");
		isPlayerOn = false;
	}
	public void newVolume()
	{
		System.out.println ("Volume is now: " + volume);
	}
	public void newSong()
	{
		System.out.println("Currently playing: " + song);
	}
	public static boolean isPlayerOn() {
		return isPlayerOn;
	}
	public static void setPlayerOn(boolean PlayerOn) {
		isPlayerOn = PlayerOn;
	}
	public static int getVolume() {
		return volume;
	}
	public static void setVolume(int volume) {
		MusicPlayer.volume = volume;
	}
	public static String getSong() {
		return song;
	}
	public static void setSong(String song) {
		MusicPlayer.song = song;
	}
}