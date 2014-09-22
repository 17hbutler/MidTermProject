import java.util.ArrayList;
public class AddData 
{
	static ArrayList <Player> data = new ArrayList <Player>();
	
	public static void newData() 
	{
		data.add(new Player("Jim", 73.8, 60.8, 290.3, 12.3, 1.4));
		data.add(new Player("Nick", 75.7, 40.1, 310.2, 11.3, 2.1));
		data.add(new Player("Jack", 70.8, 63.8, 275.6, 12.7, 1.3));
		data.add(new Player("Bill", 71.2, 58.7, 295.3, 10.3, 1.5));
		data.add(new Player("Phil", 76.8, 43.8, 260.8, 10.4, 2.0));
		
		for(Player p:data) 
		{
			print(p.getPlayer.playerName);
		}
	}
}
