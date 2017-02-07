import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args){
		
		//declaring variables
		int number1;
		int sum = 0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter an integer between 0 and 1000: ");
		number1 = keyboard.nextInt();
		
		//These operations are used to get each digit by itself and then adding them all up in the end
		
		//Gets the number in the ones place
		sum += (number1 % 10);
		
		number1 /= 10;
		
		//Gets the number in the tens place
		sum += (number1 % 10);
		
		number1 /= 10;
		
		//Gets the number in the hundredths place
		sum += (number1 % 10);
		
		number1 /= 10;
		
		System.out.println("The sum of all digits in " + sum);
		
	}

}
