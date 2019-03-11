package claimAssignments;

import java.util.Scanner;

public class ChangeCalculator {

	public static void main(String[] args) {
		//get user change request
		Scanner in = new Scanner(System.in);		
		System.out.println("Hello, ready to provide change.  Max change is 99 cents. Enter amount without decimals: ");
		int userInput = in.nextInt();
		System.out.println(returnChange(userInput));
		in.close();
	}
	public static String returnChange(int changeRequested) {
		//calculate change
		int changeInCents = (changeRequested);
		int quarters = changeInCents / 25;
		int dimes = (changeInCents - (quarters * 25)) / 10 ;
		int nickels = (changeInCents - ((dimes * 10) + (quarters * 25))) / 5;
		int pennies = (changeInCents - ((dimes * 10) + (quarters * 25) + (nickels * 5)));
	
		//print out breakdown of change
		return "Change:   Quarters: " + quarters + " \n" + "	  Dimes: " + dimes + "\n" + "          Nickels: " + nickels + "\n" + "          Pennies: " + pennies;
	}

	

}
