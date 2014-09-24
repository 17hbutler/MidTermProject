import java.io.*; 
public class WriteToFile 
{
	public static void saveFile() 
	{
		String fileName = "HereItIs.txt"; 
		
		try
		{
			FileWriter fileWriter = new FileWriter("HereItIs.txt");
			
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			
		}
	} 
}
