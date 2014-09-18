import java.util.Scanner; 
public class InputScores 
{
	public static void inputPlayers() 
	{
		System.out.println("Please Input Players name"); 
		
		Scanner theDataIS = new Scanner(System.in);
		for(int i = 0; i < 10; i++) 
		{
			String userInputIS1 = theDataIS.next();
			System.out.println("Do you want to add more players yes or no.");
			String askUser = theDataIS.next();
			
			if(askUser.equals("no")) 
			{
				inputData(); 
			}
			else if(askUser.equals("No")) 
			{
				inputData(); 
			}
			else 
			{
				
			}
		}
		 
	} 
}
