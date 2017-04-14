import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.println("How many number would you like in the array?");
		int userNum = input.nextInt();
		
		System.out.println("Enter a series of " + userNum + " numbers");
		
		int[] userArray = new int[userNum];
		
		for (int i = 0; i < userArray.length; i++) {
			
			System.out.print("Enter number " + (i + 1) + ": ");
			userArray[i] = input.nextInt();
			
		}
		
		for (int i : userArray) {
			
			sum += i;
			
		}
		
		int highest = userArray[0];
		
		for (int i = 0; i < userArray.length; i++) {
			
			if(userArray[i] > highest) {
				
				highest = userArray[i];
				
			}
			
		}
		
		int lowest = userArray[0];
		
		for (int i = 0; i < userArray.length; i++) {
			
			if(userArray[i] < lowest) {
				
				lowest = userArray[i];
				
			}
			
		}
		
		double average = sum / userArray.length;
		
		System.out.println("Your array is " + Arrays.toString(userArray));
		
		System.out.println("The lowest element is " + lowest);
		
		System.out.println("The highest element is " + highest);
		
		System.out.println("The sum of the elements is " + sum);
		
		System.out.println("The average of the elements is " + average);
		
	}

}
