import java.util.Scanner;

public class Mersenne {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		double mersenne = 0;
		int i;
		int mersenneLoop = 0;
		
		
		System.out.println("Enter a number. The program will print all the Mersenne prime numbers smaller than this number");
		int userInput = input.nextInt();
		
		i = 2;
		while(mersenne < userInput)
		{
			if(isPrime(i))
			{
				mersenne = (Math.pow(2, i)) - 1;
				
				if(mersenne < userInput)
				{
					if(isPrime((int)mersenne))
					{
						
						System.out.print((int)mersenne + "\t");
						mersenneLoop++;
					}//checks the second number to see if it's prime
					
				}//If the number is less than the user's number then it is still relevant
			}//checks if the number is prime before doing anything
			
			
			i++;
			
		}
		
		System.out.println("\n There are a total of " + mersenneLoop + " mersenne prime numbers.");
		
	}
	
	//This method tests if the number is a prime number
	public static boolean isPrime(int a)
	{
		int divisor;
		boolean prime = true;
		int j = 0;
		
			divisor = a / 2;
			
			
			for(j = 2; j <= divisor; j++)
			{
				if(a % j == 0)
				{
					prime = false;
					break;
				}
				
		
			}

			if(prime == true)
			{
				return true;
			}
			else return false;
			
		}
		
		
}

