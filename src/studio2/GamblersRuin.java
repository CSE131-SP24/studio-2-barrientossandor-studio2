package studio2;

import java.util.Scanner;

public class GamblersRuin {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Start amount");
		int startAmount = in.nextInt();
	System.out.println("Win probability");
		int winChance = in.nextInt();
	System.out.println("Win Limit");
		int winLimit = in.nextInt();
	System.out.println("Ruin Point");
		int ruinPoint = in.nextInt();
		
		System.out.println ("i want to run this __ times: ");
		int totalSimulations = in.nextInt();
//	System.out.println ("This is simulation #:");
//		int simulationNumber = in.nextInt ();
//	System.out.println ("How many times did I play?");
//		int timesPlayed = in.nextInt ();
	

	for(int i = 0;i<totalSimulations;i++); {	
	while (startAmount > ruinPoint && startAmount < winLimit){
		double probability = Math.random();
		if (probability < winChance) {
			startAmount ++;
		} else {
			startAmount --; 
		
		}
	
		totalSimulations ++;
	}
	System.out.println (totalSimulations);
	if (startAmount < ruinPoint) {
		
	System.out.println("Ruin");
	}
	else 
	{
		System.out.println("Win");
	}
	//this was simulation#:
	//i played __times
	//i lost/won
	
	System.out.println ("This was simulation #");
	System.out.println ("I played __ times");
	System.out.println("I lost/won");
	}
	 		
	}
}
