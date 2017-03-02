
import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int j = 0;
		int divisor;
		boolean prime = true;
		int primeCount = 0;
		
		System.out.println("Enter a number. The program will print all the prime numbers smaller than this number");
		int userNumber = input.nextInt();
		
		for(int i = 2; i < userNumber; i++)
		{
	
			divisor = i / 2;
			
			
			for(j = 2; j <= divisor; j++)
			{
				if(i % j == 0)
				{
					prime = false;
					break;
				}
				
		
			}

			if(prime == true)
			{
				
				System.out.print(i + "\t ");
				primeCount++;
				
			}
			
			prime = true;
		}
		
		System.out.println("\nThere are a total of " + primeCount + " prime numbers.");
		
	}
}
