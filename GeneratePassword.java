import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {
	
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Random randomNumbers = new Random();
		
		System.out.print("How many digits would you like to use for a numeric password \n");
		int user = input.nextInt();
		
		System.out.println("Your password is");
		
		randomGenerator(user);
		
		
		
	}
	
	public static int randomGenerator(int a)
	{
		Random randomNumbers = new Random();
		int i = 0;
		while(i < a)
		{
			
			int passwordNum = randomNumbers.nextInt(a);
			System.out.print(passwordNum + " ");
			i++;
			
		}
		
		return a;
	}

}
