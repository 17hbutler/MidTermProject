import java.util.Scanner;
import java.util.ArrayList; 
public class Player 
{	
	static String playerName; 
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

	public void setPlayerName(String playerName) 
	{
		this.playerName = playerName;
	}

	public void setScoringAverage(double scoringAverage) 
	{
		this.scoringAverage = scoringAverage;
	}

	public void setDrivingAccuracy(double drivingAccuracy) 
	{
		this.drivingAccuracy = drivingAccuracy;
	}

	public void setDrivingDistance(double drivingDistance) 
	{
		this.drivingDistance = drivingDistance;
	}

	public void setGreensInReg(double greensInReg) 
	{
		this.greensInReg = greensInReg;
	}
	
	public void setPuttsPerHole(double puttsPerHole) 
	{
		this.puttsPerHole = puttsPerHole;
	}




	@Override
	public String toString() 
	{
		return "Name \t" + playerName + "\n" + "Scoring Average \t" + scoringAverage + "\n" + "Drving Accuracy \t" + drivingAccuracy + "\n" + "Driving Distance \t" + drivingDistance + "\n" + "Greens in regulation \t" + greensInReg + "\n" + "Putts per hole \t\t" + puttsPerHole + "\n"; 
	}


	
	
}
