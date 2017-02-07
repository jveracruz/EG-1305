import java.util.Scanner;

public class CountMoney {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//This asks the user to enter an amount to see the statistics
		System.out.println("Enter an ammount in integers, for example: 1156");
		
		System.out.print("for 11 dollars and 56 cents : ");
		int money = input.nextInt();
		
		System.out.println("Your amount of " + money + " consists of ");
		
		//These operations are to calculate the coins and dollars in the amount
		int cents = money % 100;
		int dollars = (money - cents) / 100;
		int quarters = cents / 25;
		int dimes = (cents - (25 * quarters)) / 10;
		int nickels = (cents - ((25 * quarters) + (10 * dimes))) / 5;
		int pennies = (cents - ((25 * quarters) + (10 * dimes) + (5 * nickels)));
		
		//This prints out the amount of each variable in the number
		System.out.println("" + dollars + " dollars");
		System.out.println("" + quarters + " quarters");
		System.out.println("" + dimes + " dimes");
		System.out.println("" + nickels + " nickels");
		System.out.println("" + pennies + " pennies");
	}

}
