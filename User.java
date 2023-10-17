package command;

import java.util.Scanner;

public class User 
{
	public static void main(String[] args) 
	{
			Scanner input = new Scanner(System.in);
			
			int exit = 0;
			
			while (exit == 0)
			{
			
			System.out.print("Welcome to your Smart Home Solution!\nSelect your device:\n\t1. Lights\n\t2. Thermostat\n\t3. Music Player\n\t4. Exit\nInput here: ");
			
			int device = input.nextInt();
			input.nextLine();
			
			int action = 0;
			String yn = "n";
			
			App app = new App();
			
			switch (device)
			{
				case 1: Light lights = new Light();
				
						TurnLightsOn turnLightsOn = new TurnLightsOn (lights);
						TurnLightsOff turnLightsOff = new TurnLightsOff (lights);
						
						System.out.print("Current status: ");
				
						if (Light.isLightOn())
						{
							System.out.print("ON\n");
							System.out.println("Off the lights?");
						}
						else
						{
							System.out.print("OFF\n");
							System.out.println("On the lights?");
						}
						
						System.out.print("Y/N: ");
						yn = input.nextLine().toLowerCase();
						
						switch (yn)
						{
							case "y": 
									if (Light.isLightOn() == false)
									{
										Light.setLightOn(true);
										app.receiveInstructions(turnLightsOn);
										app.implementInstructions();
									}
									else
									{
										Light.setLightOn(false);
										app.receiveInstructions(turnLightsOff);
										app.implementInstructions();
									}
							break;
							case "n":
								System.out.println("\nk then");
						}		
						break;
				case 2: Thermostat thermostat = new Thermostat();
				
						TurnThermosOn turnThermosOn = new TurnThermosOn (thermostat);
						TurnThermosOff turnThermosOff = new TurnThermosOff (thermostat);
						
						System.out.print("Current status: ");
				
						if (Thermostat.isThermosOn())
						{
							System.out.print("ON\tTemperature: " + Thermostat.getTemperature() + "\n");
							System.out.print("\t1. Turn off\n\t2. Set temperature\n\t3. Exit\nInput here: ");
							
							int thermosControls = input.nextInt();
							
							switch (thermosControls)
							{
								case 1: 
										if (Thermostat.isThermosOn())
										{
											Thermostat.setThermosOn(false);
											app.receiveInstructions(turnThermosOff);
											app.implementInstructions();
										}
										break;
								case 2:
										System.out.print("Set temperature to: ");
										int temperature = input.nextInt();
										Thermostat.setTemperature(temperature);
										System.out.println("New temperature: " + Thermostat.getTemperature() + "\n");
										break;
								case 3: System.out.println("\nk then");
										break;
							}
						}
						else
						{
							System.out.print("OFF\n");
							System.out.println("On the thermostat?");
							System.out.print("Y/N: ");
							yn = input.nextLine().toLowerCase();
							
							switch (yn)
							{
								case "y": 
										if (Thermostat.isThermosOn() == false)
										{
											Thermostat.setThermosOn(true);
											app.receiveInstructions(turnThermosOn);
											app.implementInstructions();
											break;
										}
								case "n":
										System.out.println("\nk then");
										break;
							}
						}
						break;
				case 3: MusicPlayer player = new MusicPlayer();
						TurnPlayerOn turnPlayerOn = new TurnPlayerOn (player);
						TurnPlayerOff turnPlayerOff = new TurnPlayerOff (player);
						
						System.out.print("Current status: ");
				
						if (MusicPlayer.isPlayerOn())
						{
							System.out.print("ON\tCurrently Playing: " + MusicPlayer.getSong() + "\tCurrent Volume: " + MusicPlayer.getVolume() + "\n");
							System.out.print("\t1. Turn off\n\t2. Set volume\n\t3. Play Song\n\t4. Exit\nInput here: ");
							
							int playerControls = input.nextInt();
							
							switch (playerControls)
							{
								case 1: 
										if (MusicPlayer.isPlayerOn())
										{
											MusicPlayer.setPlayerOn(false);
											app.receiveInstructions(turnPlayerOff);
											app.implementInstructions();
										}
										break;
								case 2:
										System.out.print("Set volume to: ");
										int volume = input.nextInt();
										MusicPlayer.setVolume(volume);
										System.out.println("New volume: " + MusicPlayer.getVolume() + "\n");
										break;
								case 3:
										System.out.print("Choose song: \n\t1. StellarSong - Happy Ending\n\t2. StellarSong - lonely together"
												+ "\n\t3. StellarSong - I Wouldn't Mind (Loving You)\n\t4. StellarSong - In This Dream, a Deltarune"
												+ " Chapter 2 song\n\t5. Stellar's Song (I Think That's Okay) an original song by StellarSong\nInput here: ");
										int songChoice = input.nextInt();
										switch (songChoice)
										{
											case 1: MusicPlayer.setSong("StellarSong - Happy Ending"); break;
											case 2: MusicPlayer.setSong("StellarSong - lonely together"); break;
											case 3: MusicPlayer.setSong("StellarSong - I Wouldn't Mind (Loving You)"); break;
											case 4: MusicPlayer.setSong("StellarSong - StellarSong - In This Dream, a Deltarune Chapter 2 song"); break;
											case 5: MusicPlayer.setSong("Stellar's Song (I Think That's Okay) an original song by StellarSong"); break;
										}
										System.out.println("Currently Playing: " + MusicPlayer.getSong() + "\n");
										break;
								case 4: System.out.println("\nk then");
										break;
							}
						}
						else
						{
							System.out.print("OFF\n");
							System.out.println("On the music player?");
							System.out.print("Y/N: ");
							yn = input.nextLine().toLowerCase();
							
							switch (yn)
							{
								case "y": 
										if (MusicPlayer.isPlayerOn() == false)
										{
											MusicPlayer.setPlayerOn(true);
											app.receiveInstructions(turnPlayerOn);
											app.implementInstructions();
										}
								break;
								case "n":
									System.out.println("\nk then");
							}
						}
						break;
				case 4: exit = 1;
			}
		}
	}

}
