import java.util.Scanner;
import java.util.Random;

public class PaperRockScissors {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		//Initializes computer variable to generate numbers from 1 to 2
		int computer = randomNumbers.nextInt(3) ;
		
		//This tells the user to choose a number
		System.out.print("scissors (0), rock (1), paper (2): ");
		int player = input.nextInt();
		
		//These organize the set of the game to show who loses from their choice and who wins
		if((computer == 0) && (player == 0))
		{
			System.out.println("It's a draw.");
		}
		
		if((computer == 0) && (player == 1))
		{
			System.out.println("You win: Rock beats scissors");
		}
		
		if((computer == 0) && (player == 2))
		{
			System.out.println("You lose: Scissors beats paper");
		}
		
		if((computer == 1) && (player == 0))
		{
			System.out.println("You lose: Rock beats scissors");
		}
		
		if((computer == 1) && (player == 1))
		{
			System.out.println("It's a draw");
		}
		
		if((computer == 1) && (player == 2))
		{
			System.out.println("You win: Paper beats rock");
		}
		
		if((computer == 2) && (player == 0))
		{
			System.out.println("You win: Scissors beats paper");
		}
		
		if((computer == 2) && (player == 1))
		{
			System.out.println("You lose: Paper beats rock");
		}
		
		if((computer == 2) && (player == 2))
		{
			System.out.println("It's a draw");
		}
		
		
	}
	
}
