import java.util.Scanner;
import java.util.ArrayList; 
public class Player 
{	
	String playerName; 
	double scoringAverage; 
	double drivingAccuracy; 
	double drivingDistance; 
	double greensInReg;
	double puttsPerHole; 
	
	public Player(String pN, double sA, double dA, double dD, double gR, double pH) 
	{
		playerName = pN; 
		scoringAverage = sA; 
		drivingAccuracy = dA; 
		drivingDistance = dD;
		greensInReg = gR; 
		puttsPerHole = pH; 
		
	}
	

	public String getPlayerName() 
	{
		return playerName;
	}

	public double getScoringAverage() 
	{
		return scoringAverage;
	}

	public double getDrivingAccuracy() 
	{
		return drivingAccuracy;
	}

	public double getDrivingDistance() 
	{
		return drivingDistance;
	}

	public double getGreensInReg() 
	{
		return greensInReg;
	}

	public double getPuttsPerHole() 
	{
		return puttsPerHole;
	}

}
