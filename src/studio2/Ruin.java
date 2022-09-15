package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("The amount of money that you start with: ");
		double startAmount = in.nextDouble();
		
		System.out.println("The probability that you win a single play: ");
		double winChance = in.nextDouble();
		
		System.out.println("Amount for successful day: ");
		double winLimit = in.nextDouble();
		
		double playAmount = startAmount;
		
		System.out.println("SIMULATIONS: ");
		int totalSimulations = in.nextInt();
	
		
		for (int i = 1; i <= totalSimulations; i++)
		{
			while (playAmount > 0 && playAmount < winLimit) 
			{
				if (Math.random() < winChance)
				{
					playAmount ++;
					//System.out.println(playAmount + " WIN");
				}
				else
				{
					playAmount --;
					//System.out.println(playAmount + " LOSE");
				}
				
				//playAmount++;
			}
			System.out.println(i);
		}
		
		
	}

}
