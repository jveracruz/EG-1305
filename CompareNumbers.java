import java.util.Scanner;

public class CompareNumbers {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		//Tells the user to choose three numbers
		System.out.print("Enter first integer: ");
		int number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		int number2 = input.nextInt();
		
		System.out.print("Enter third integer: ");
		int number3 = input.nextInt();
		
		//Prints the three numbers in order that the user input them
		System.out.println("For the numbers " + number1 + ", " + number2 + " and " + number3);
		
		//Compares each number to the others to see which is smallest and largest
		if((number1 > number2) && (number1 > number3))
		{
			System.out.println("Largest is " + number1);
		}
		else if((number2 > number1) && (number2 > number3))
		{
			System.out.println("Largest is " + number2);
		}
		else if((number3 > number1) && (number3 > number2))
		{
			System.out.println("Largest is " + number3);
		}
		
		if((number1 < number2) && (number1 < number3))
		{
			System.out.println("Smallest is " + number1);
		}
		else if((number2 < number1) && (number2 < number3))
		{
			System.out.println("Smallest is " + number2);
		}
		else if((number3 < number1) && (number3 < number2))
		{
			System.out.println("Smallest is " + number3);
		}
		
		//Prints out resultants from addition, multiplication, and the average of the three numbers
		System.out.println("Sum is " + (number1 + number2 + number3));
		
		System.out.println("Product is " + (number1 * number2 * number3));
		
		System.out.println("Average is " + ((number1 + number2 + number3) / 3));
	}
}
