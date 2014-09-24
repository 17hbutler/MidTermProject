import java.util.Scanner;

public class Calculate 
{
	static int counter = 0;
	static String newPlayerName; 

	public static String inputNewName() 
	{
		boolean wantsToContinue = true; 
		while(wantsToContinue) 
		{
			System.out.println(" Please input a name.");
			Scanner newScanner = new Scanner(System.in); 
			String userInput1 = newScanner.next(); 
			newPlayerName = userInput1;  
			System.out.println("Do you want to input another name. Yes or No");
			String userInput2 = newScanner.next();
			counter++; 
			if(userInput2.equals("no") || userInput2.equals("No")) 
			{
				wantsToContinue = false; 
			}
			else 
			{
				wantsToContinue = true; 
			}
		}
		return newPlayerName; 
	}
	
	public static void inputNewScoringAverage() 
	{
		
	}
}
